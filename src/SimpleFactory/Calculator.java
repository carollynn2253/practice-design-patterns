package SimpleFactory;

import java.util.Scanner;

/**
 * Created by chiu on 2016/12/15.
 */
public class Calculator {

    public static void main(String[] args) throws Exception {
        System.out.print("Please insert numberA: ");
        double numA = new Scanner(System.in).nextDouble();

        System.out.print("Please insert numberB: ");
        double numB = new Scanner(System.in).nextDouble();

        System.out.print("Please insert SimpleFactory.BaseOperation (+, -, *, /): ");
        String oper = new Scanner(System.in).next();

        BaseOperation operation = OperationFactory.createOperation(oper);
        operation.setNumberA(numA);
        operation.setNumberB(numB);

        System.out.print("Result: " + operation.getResult());
    }
}
