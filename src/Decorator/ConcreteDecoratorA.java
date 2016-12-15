package Decorator;

/**
 * Created by chiu on 2016/12/15.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("Specific objectA operating");
    }
}
