package Factory;

/**
 * Created by chiu on 2016/12/15.
 */
public class FactoryMain {

    public static void main(String[] args) {
        //simple factory
        Nightingale studentA = SimpleFactory.createNightingale(1);
        studentA.buyRice();

        Nightingale studentB = SimpleFactory.createNightingale(1);
        studentB.sweep();

        Nightingale studentC = SimpleFactory.createNightingale(1);
        studentC.wash();
    }
}
