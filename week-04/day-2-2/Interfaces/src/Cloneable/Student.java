package Cloneable;

public class Student extends Person {

    String previousOrganization;
    int skippedDays;

    public int skipDays(int numberOfDays){
        return skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }
    public Student() {
        super();
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    @Override
    public Student clone() {
        return new Student(name, age, gender, previousOrganization);
    }
}
