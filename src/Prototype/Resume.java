package Prototype;

/**
 * Created by chiu on 2016/12/16.
 */
public class Resume extends ResumePrototype implements Cloneable {

    public Resume(String name) {
        super(name);
    }

    @Override
    public ResumePrototype clone() {
        return this;
    }

}
