package Strategy.type;

/**
 * Created by chiu on 2016/12/15.
 */
public class CashDiscount extends CashSuper {

    private double discount;

    public CashDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public int acceptCash(int originPrice) {
        return (int) (originPrice * discount);
    }
}
