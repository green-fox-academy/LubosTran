package Cloneable;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student student = new Student();
        people.add(student);
        Student John = new Student("John",20,"male","BME");
        Student johnTheClone = John.clone();

        student.skipDays(3);



        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

    }
}
