package SimpleFactory.operate;

/**
 * Created by chiu on 2016/12/15.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() throws Exception {
        if (this.getNumberB() != 0) {
            return this.getNumberA() / this.getNumberB();
        } else {
            throw new Exception("NumberB can not be 0.");
        }
    }
}
