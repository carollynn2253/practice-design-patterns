package SimpleFactory;

/**
 * Created by chiu on 2016/12/15.
 */
class OperationFactory {
    static BaseOperation createOperation(String operate) {
        BaseOperation operation = null;
        switch (operate) {
            case "+":
                operation = new Operation.OperationAdd();
                break;

            case "-":
                operation = new Operation.OperationSub();
                break;

            case "*":
                operation = new Operation.OperationMul();
                break;

            case "/":
                operation = new Operation.OperationDiv();
                break;
        }
        return operation;
    }
}
