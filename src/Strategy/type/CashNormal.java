package Strategy.type;

/**
 * Created by chiu on 2016/12/15.
 */
public class CashNormal extends CashSuper {

    @Override
    public int acceptCash(int originPrice) {
        return originPrice;
    }
}
