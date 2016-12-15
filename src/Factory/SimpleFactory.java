package Factory;

import Factory.person.Nightingale;
import Factory.person.Undergraduate;
import Factory.person.Volunteer;

/**
 * Created by chiu on 2016/12/15.
 */
public class SimpleFactory {

    public static Nightingale createNightingale(int type) {
        Nightingale nightingale = null;
        switch (type) {
            case 1:
                nightingale = new Undergraduate();
                break;

            case 2:
                nightingale = new Volunteer();
                break;
        }

        return nightingale;
    }
}
