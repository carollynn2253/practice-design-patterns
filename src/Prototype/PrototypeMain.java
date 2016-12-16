package Prototype;

/**
 * Created by chiu on 2016/12/16.
 */
public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("Ching Ting, Chiu");
        resume.setPersonalInfo("Female", 20);
        resume.setWorkExperience("2015 ~ 2016", "Google");

        Resume resume1 = (Resume) resume.clone();
        resume1.setWorkExperience("2014 ~ 2016", "Yahoo");

        resume.display();
        resume1.display();
    }
}
