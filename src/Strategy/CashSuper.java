package Strategy;

/**
 * Created by chiu on 2016/12/15.
 */
public class CashSuper {
    //原價
    public static class CashNormal extends BaseCashSuper {

        @Override
        public int acceptCash(int originPrice) {
            return originPrice;
        }
    }

    //打折
    public static class CashDiscount extends BaseCashSuper {

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
    public static class CashPoint extends BaseCashSuper {

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
}
