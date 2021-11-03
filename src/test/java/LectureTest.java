import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    public void getHighestAverage(){
        Lecture lecture = new Lecture();

        //given
        List<Double> student1 = new ArrayList<>();
        student1.add(80.0);

        List<Double> student2 = new ArrayList<>();
        student2.add(30.0);

        List<Double> student3 = new ArrayList<>();
        student3.add(40.0);

        //when
        lecture.enter(new Student("Ama",student1, Level.THREE));
        lecture.enter(new Student("Kofi",student2, Level.TWO));
        lecture.enter(new Student("Adjei",student3, Level.ONE));


        //then
        assertEquals(80,lecture.getHighestAverageGarde());
    }

    //test naughty_student class

    @Test
    public void testNaughtyStudent(){
        //given
        List<Double>studentGrade = List.of(1.0,2.0,3.0,4.0,5.0);
        Lecture lecture = new Lecture();
        NaughtyStudent naughtyStudent = new NaughtyStudent("Lily",studentGrade, Level.THREE);

        Student student = new Student("Yaw",studentGrade, Level.ONE);
        lecture.enter(naughtyStudent);

        //when
        double goodStudent = student.getAverageGrade();
        double naughty = naughtyStudent.increaseAverageGrade();

        //then
        assertNotEquals(goodStudent, naughty);

    }


}