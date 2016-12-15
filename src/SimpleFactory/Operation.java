package SimpleFactory;

/**
 * Created by chiu on 2016/12/15.
 */
public class Operation {
    public static class OperationAdd extends BaseOperation {
        @Override
        public double getResult() {
            return this.getNumberA() + this.getNumberB();
        }
    }

    public static class OperationSub extends BaseOperation {
        @Override
        public double getResult() {
            return this.getNumberA() - this.getNumberB();
        }
    }

    public static class OperationMul extends BaseOperation {
        @Override
        public double getResult() {
            return this.getNumberA() * this.getNumberB();
        }
    }

    public static class OperationDiv extends BaseOperation {
        @Override
        public double getResult() throws Exception {
            if (this.getNumberB() != 0) {
                return this.getNumberA() / this.getNumberB();
            } else {
                throw new Exception("NumberB can not be 0.");
            }
        }
    }
}
