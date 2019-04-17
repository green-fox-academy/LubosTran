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
public class Main {
    public static void main(String[] args) {
        Student aStudent = new Student("Ahoy");
        Teacher aTeacher = new Teacher("Aloha");

        aStudent.learn();
        aStudent.question(aTeacher);

        aTeacher.answer();
        aTeacher.teach(aStudent);
    }
}
