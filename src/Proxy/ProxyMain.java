package Proxy;

import java.util.Scanner;

/**
 * Created by chiu on 2016/12/16.
 */
public class ProxyMain {
    public static void main(String[] args) {
        System.out.print("Pursuing who? ");
        String girlName = new Scanner(System.in).next();

        Girl girl = new Girl();
        girl.setName(girlName);

        Agent agent = new Agent(girl);
        agent.giveChocolate();
        agent.giveFlowers();
    }
}
