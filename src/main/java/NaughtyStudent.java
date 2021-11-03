import java.util.List;

public class NaughtyStudent extends Student{


    public NaughtyStudent(String name, List<Double> grades, Level level) {
        super(name, grades, level);
    }

    public double increaseAverageGrade(){
        return getAverageGrade() + (getAverageGrade() * 0.1);
    }
}
