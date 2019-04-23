package PreInheritance;

public class Student  extends Person{

    String previousOrganization;
    int skippedDays;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", " + age + " years old " + gender
        + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already");

    }

    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }

    public int skipDays(int numberOfDays){
        return skippedDays += numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization){
        super(name, age, gender);
        skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }
    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }
}
