package Proxy;

/**
 * Created by chiu on 2016/12/16.
 */
//代理人 for Boy
public class Agent implements IPersue {

    private Boy boy;

    public Agent(Girl girl) {
        boy = new Boy(girl);
    }

    @Override
    public void giveFlowers() {
        boy.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        boy.giveChocolate();
    }
}
