package Strategy;

/**
 * Created by chiu on 2016/12/15.
 */
class CashFactory {
    public static BaseCashSuper createCashAccept(int type) {
        BaseCashSuper cashSuper = null;
        switch (type) {
            case 1:
                cashSuper = new CashSuper.CashNormal();
                break;

            //打8折
            case 2:
                cashSuper = new CashSuper.CashDiscount(0.8);
                break;

            //滿300送100
            case 3:
                cashSuper = new CashSuper.CashPoint(300, 100);
                break;
        }
        return cashSuper;
    }
}
