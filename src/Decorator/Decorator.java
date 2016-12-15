package Decorator;

/**
 * Created by chiu on 2016/12/15.
 */
public abstract class Decorator extends Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
