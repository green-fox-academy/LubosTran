package GreenFoxOrganinzation;

import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList students;
    ArrayList mentors;

    public ArrayList addStudent(Student Student){
        students.add(Student);
        return students;
    }

    public ArrayList addMentor(Mentor Mentor){
        mentors.add(Mentor);
        return mentors;
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " " + "students" + " and "
                + mentors.size()+" "+ "mentors" +".");
    }

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList();
        this.mentors = new ArrayList();
    }
}
