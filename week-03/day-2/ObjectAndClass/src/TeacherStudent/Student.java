package TeacherStudent;
/*
    Create Student and Teacher classes
    Student
        learn()
        question(teacher) -> calls the teachers answer method
    Teacher
        teach(student) -> calls the students learn method
        answer()

 */

public class Student {
    String name;
    public Student(String name){
        this.name = name;
    }

    public void learn(){}

    public void question(Teacher teacher){
        learn();
    }
}
