import java.util.List;

public class Student implements Nameable, HasLevel {
    private final List<Double> grades;
    private String name;
    private HasLevel.Level level;

    public Student(String name, List<Double> grades, HasLevel.Level level) {
        this.grades = grades;
        this.name = name;
        this.level = level;
    }

    public double getAverageGrade(){
        double grade_sum = 0;
        for(double e : grades){
            grade_sum += e;
        }

        double average_grade = 0;
        if (grades.size() > 0){
            average_grade = grade_sum / grades.size();
        }
        return Math.round(average_grade);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
