package Decorator;

/**
 * Created by chiu on 2016/12/15.
 */
public class ConcreteComponent extends Component {

    @Override
    public void Operation() {
        System.out.println("Specific object operating");
    }
}
