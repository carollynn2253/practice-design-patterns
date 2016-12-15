package Decorator;

/**
 * Created by chiu on 2016/12/15.
 */
public class DecoratorMain {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(c);  //decorate c with decoratorA
        decoratorB.setComponent(decoratorA);  //decorate decoratorA with decoratorB
        decoratorB.Operation();

        decoratorB.addBehavior();  //do decoratorB's behavior
    }
}
