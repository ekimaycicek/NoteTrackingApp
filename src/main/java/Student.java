import java.util.ArrayList;

public class Student {

    /*
öğrenci not takip uygulaması ile öğrencilerin adını, soyadını ve aldıkları notları takip
 etmeniz gerekiyor.
 */
    private String name;
    private String surname;
    private ArrayList<Integer> notes;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.notes = new ArrayList<>();
    }

    public void addNote(int note) {
        notes.add(note);
    }

    public double gradeAverageCalculate() {
        int total = 0;
        for (int not : notes) {
            total += not;
        }
        return (double) total / notes.size();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}






