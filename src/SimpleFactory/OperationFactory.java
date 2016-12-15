package SimpleFactory;

/**
 * Created by chiu on 2016/12/15.
 */
class OperationFactory {
    private static class OperationAdd extends Operation {
        @Override
        public double getResult() {
            return this.getNumberA() + this.getNumberB();
        }
    }

    private static class OperationSub extends Operation {
        @Override
        public double getResult() {
            return this.getNumberA() - this.getNumberB();
        }
    }

    private static class OperationMul extends Operation {
        @Override
        public double getResult() {
            return this.getNumberA() * this.getNumberB();
        }
    }

    private static class OperationDiv extends Operation {
        @Override
        public double getResult() throws Exception {
            if (this.getNumberB() != 0) {
                return this.getNumberA() / this.getNumberB();
            } else {
                throw new Exception("NumberB can not be 0.");
            }
        }
    }

    static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;

            case "-":
                operation = new OperationSub();
                break;

            case "*":
                operation = new OperationMul();
                break;

            case "/":
                operation = new OperationDiv();
                break;
        }
        return operation;
    }
}
