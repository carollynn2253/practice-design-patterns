package Strategy.type;

/**
 * Created by chiu on 2016/12/15.
 */
public class CashPoint extends CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashPoint(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public int acceptCash(int originPrice) {
        int result = originPrice;
        if (originPrice >= moneyCondition) {
            result = originPrice - (int) ((int) (originPrice / moneyCondition) * moneyReturn);
        }
        return result;
    }
}