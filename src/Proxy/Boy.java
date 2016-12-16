package Proxy;

/**
 * Created by chiu on 2016/12/16.
 */
//追求者
public class Boy implements IPersue {

    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveFlowers() {
        System.out.println("Boy give flowers to " + girl.getName() + ".");
    }

    @Override
    public void giveChocolate() {
        System.out.println("Boy give chocolate to " + girl.getName() + ".");
    }
}
