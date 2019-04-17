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
public class Teacher {
    String name;
    public Teacher(String name){
        this.name = name;
    }

    public void answer(){}

    public void teach(Student student){
        answer();
    }
}
