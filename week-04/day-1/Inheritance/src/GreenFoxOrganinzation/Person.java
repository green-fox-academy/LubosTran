package GreenFoxOrganinzation;

public class Person {
    String name;
    int age;
    String gender;

    public void introduce(){
        System.out.println("Hi, I'm " + name + ", "+ age + " years old " + gender);
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //This is default constructor
    public Person(){
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

}
