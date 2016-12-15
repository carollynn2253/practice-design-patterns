package Strategy;

import Strategy.type.CashDiscount;
import Strategy.type.CashNormal;
import Strategy.type.CashPoint;
import Strategy.type.CashSuper;

/**
 * Created by chiu on 2016/12/15.
 */
class CashFactory {
    public static CashSuper createCashAccept(int type) {
        CashSuper cashSuper = null;
        switch (type) {
            case 1:
                cashSuper = new CashNormal();
                break;

            //打8折
            case 2:
                cashSuper = new CashDiscount(0.8);
                break;

            //滿300送100
            case 3:
                cashSuper = new CashPoint(300, 100);
                break;
        }
        return cashSuper;
    }
}
