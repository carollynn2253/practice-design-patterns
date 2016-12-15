package Factory.factories;

import Factory.person.Nightingale;
import Factory.person.Undergraduate;
import Factory.person.Volunteer;

/**
 * Created by chiu on 2016/12/15.
 */
public interface IFactory {
    Nightingale createNightingale();
}
