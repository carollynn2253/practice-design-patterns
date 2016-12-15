package Factory.factories;

import Factory.person.Nightingale;
import Factory.person.Volunteer;

/**
 * Created by chiu on 2016/12/15.
 */
public class VolunteerFactory implements IFactory {
    @Override
    public Nightingale createNightingale() {
        return new Volunteer();
    }
}
