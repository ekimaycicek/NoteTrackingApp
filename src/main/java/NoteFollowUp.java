import java.util.ArrayList;

public class NoteFollowUp {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Ekim", "Aycicek");
        student1.addNote(95);
        student1.addNote(90);
        student1.addNote(85);

        Student studen2 = new Student("Ali", "Can");
        studen2.addNote(35);
        studen2.addNote(45);
        studen2.addNote(10);

        studentList.add(student1);
        studentList.add(studen2);

        for (Student student : studentList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("Grade average: " + student.gradeAverageCalculate());
            System.out.println();
        }
    }
}
