package Factory.factories;

import Factory.person.Nightingale;
import Factory.person.Undergraduate;

/**
 * Created by chiu on 2016/12/15.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public Nightingale createNightingale() {
        return new Undergraduate();
    }
}
