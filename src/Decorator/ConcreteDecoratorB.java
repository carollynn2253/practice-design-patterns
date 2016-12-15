package Decorator;

/**
 * Created by chiu on 2016/12/15.
 */
public class ConcreteDecoratorB extends Decorator {
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("Specific objectB operating");
    }

    public void addBehavior() {
        System.out.println("objectB's behavior");
    }
}
