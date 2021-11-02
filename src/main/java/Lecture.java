import java.util.ArrayList;
import java.util.List;

public class Lecture {

    List<Student> students;

    public Lecture(){
        students = new ArrayList<>();
    }

    public void enter(Student student){
        students.add(student);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "students=" + students +
                '}'+'\n';
    }

    public List<Student> getStudents() {
        return students;
    }

    public Double getHighestAverageGarde(){
        double hg = 0.0;
        for (Student stud : students){
            hg = Math.max(stud.getAverageGrade(), hg);
        }
        return hg;
    }
}
