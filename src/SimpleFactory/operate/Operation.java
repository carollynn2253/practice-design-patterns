package SimpleFactory.operate;

/**
 * Created by chiu on 2016/12/15.
 */
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    double getNumberA() {
        return numberA;
    }

    double getNumberB() {
        return numberB;
    }

    public void setNumberB(double value) {
        this.numberB = value;
    }

    public void setNumberA(double value) {
        this.numberA = value;
    }

    public abstract double getResult() throws Exception;
}
