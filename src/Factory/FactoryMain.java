package Factory;

import Factory.factories.IFactory;
import Factory.factories.UndergraduateFactory;
import Factory.factories.VolunteerFactory;
import Factory.person.Nightingale;

/**
 * Created by chiu on 2016/12/15.
 */
public class FactoryMain {

    public static void main(String[] args) {
        //simple factory, need to insert type every time when create Nightingale
//        Nightingale studentA = SimpleFactory.createNightingale(1);
//        studentA.buyRice();
//
//        Nightingale studentB = SimpleFactory.createNightingale(1);
//        studentB.sweep();
//
//        Nightingale studentC = SimpleFactory.createNightingale(1);
//        studentC.wash();
//
//        Nightingale volunteer = SimpleFactory.createNightingale(2);
//        volunteer.buyRice();


        //factory, use IFactory to create different type of Nightingale
        IFactory undergraduateFactory = new UndergraduateFactory();
        IFactory volunteerFactory = new VolunteerFactory();

        Nightingale studentA = undergraduateFactory.createNightingale();
        studentA.buyRice();

        Nightingale studentB = undergraduateFactory.createNightingale();
        studentB.wash();

        Nightingale studentC = undergraduateFactory.createNightingale();
        studentC.sweep();

        Nightingale volunteer = volunteerFactory.createNightingale();
        volunteer.wash();
    }
}
