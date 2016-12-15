package Strategy;

import Strategy.type.CashSuper;

import java.util.Scanner;

/**
 * Created by chiu on 2016/12/15.
 */
public class Cashier {
    //simple factory
    public static void main(String[] args) {
        System.out.print("Origin Total Price: ");
        int originPrice = new Scanner(System.in).nextInt();

        System.out.print("Please choose type (1. normal  2. 20% off  3. 300 return 100): ");
        int type = new Scanner(System.in).nextInt();

        CashSuper cashSuper = CashFactory.createCashAccept(type);
        System.out.print("Result Total: " + cashSuper.acceptCash(originPrice));
    }
}
