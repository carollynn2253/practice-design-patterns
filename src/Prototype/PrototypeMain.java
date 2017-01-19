package Prototype;

/**
 * Created by chiu on 2016/12/16.
 */
public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume("Ching Ting, Chiu");
        resumeA.setPersonalInfo("Female", 20);
        resumeA.setWorkExperience("1999 ~ 2000", "X Company");

        Resume resumeB = resumeA.clone();

        //update resumeA
        resumeA.setPersonalInfo("Female", 33);
        resumeA.setWorkExperience("2014 ~ 2016", "Y Company");

        System.out.println("======Resume A======");
        resumeA.display();
        System.out.println("\n======Resume B======");
        resumeB.display();
    }
}
