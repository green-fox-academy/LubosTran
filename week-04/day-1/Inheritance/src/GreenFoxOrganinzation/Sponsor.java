package GreenFoxOrganinzation;


public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", "+ age + " years old " + gender + " who represents "
                + company + " and hired " + hiredStudents + " so far. ");
    }

    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public int hire(){
         return hiredStudents++;
    }

    public Sponsor(String name, int age,String gender, String company){
        hiredStudents = 0;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
    }

    public Sponsor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }

}
