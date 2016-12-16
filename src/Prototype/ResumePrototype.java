package Prototype;

/**
 * Created by chiu on 2016/12/16.
 */
public abstract class ResumePrototype {
    private String name = "";
    private String gender = "";
    private int age = 0;

    private String duration = "";
    private String lastCompanyName = "";


    public ResumePrototype(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void setWorkExperience(String duration, String lastCompanyName) {
        this.duration = duration;
        this.lastCompanyName = lastCompanyName;
    }

    public void display() {
        System.out.println(name + "  " + gender + " " + age);
        System.out.println(duration + " " + lastCompanyName);
    }

    public abstract ResumePrototype clone();
}
