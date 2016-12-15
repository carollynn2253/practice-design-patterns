package SimpleFactory;

import SimpleFactory.operate.*;

/**
 * Created by chiu on 2016/12/15.
 */
class OperationFactory {
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
