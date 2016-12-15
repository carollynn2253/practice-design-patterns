package SimpleFactory.operate;

/**
 * Created by chiu on 2016/12/15.
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() * this.getNumberB();
    }
}
