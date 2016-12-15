package Strategy;

/**
 * Created by chiu on 2016/12/15.
 */
class CashFactory {

    //原價
    private static class CashNormal extends CashSuper {

        @Override
        public int acceptCash(int originPrice) {
            return originPrice;
        }
    }

    //打折
    private static class CashDiscount extends CashSuper {

        private double discount;

        public CashDiscount(double discount) {
            this.discount = discount;
        }

        @Override
        public int acceptCash(int originPrice) {
            return (int) (originPrice * discount);
        }
    }

    //使用紅利
    private static class CashPoint extends CashSuper {

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
