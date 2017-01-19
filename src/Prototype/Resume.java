package Prototype;

/**
 * Created by chiu on 2016/12/16.
 */
public class Resume implements Cloneable {
    private String name = "";
    private String gender = "";
    private int age = 0;

    private String duration = "";
    private String lastCompanyName = "";


    public Resume(String name) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //shallow copy
//        return super.clone();

        //deep copy
        Resume newResume = new Resume(name);
        newResume.setPersonalInfo(gender, age);
        newResume.setWorkExperience(duration, lastCompanyName);
        return newResume;
    }
}
