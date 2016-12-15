package Strategy;

import Strategy.type.CashDiscount;
import Strategy.type.CashNormal;
import Strategy.type.CashPoint;
import Strategy.type.CashSuper;

import java.util.Scanner;

/**
 * Created by chiu on 2016/12/15.
 */
public class Cashier {
    //simple factory, use CashSuper and CashFactory
//    public static void main(String[] args) {
//        System.out.print("Origin Total Price: ");
//        int originPrice = new Scanner(System.in).nextInt();
//
//        System.out.print("Please choose type (1. normal  2. 20% off  3. 300 return 100): ");
//        int type = new Scanner(System.in).nextInt();
//
//        CashSuper cashSuper = CashFactory.createCashAccept(type);
//        System.out.print("Result Total: " + cashSuper.acceptCash(originPrice));
//    }

    //strategy + simple factory, use CashContext only!
    public static void main(String[] args) {
        System.out.print("Origin Total Price: ");
        int originPrice = new Scanner(System.in).nextInt();

        System.out.print("Please choose type (1. normal  2. 20% off  3. 300 return 100): ");
        int type = new Scanner(System.in).nextInt();

        CashContext cashContext = new CashContext(type);
        System.out.print("Result Total: " + cashContext.getResult(originPrice));
    }
}
