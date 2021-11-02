import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    public void testClassInstance(){
        //given
        List<Double> studentGrade = List.of(1.0,2.0,3.0,4.0,5.0);

        //when
        NaughtyStudent naughtyStudent = new NaughtyStudent("Jane",studentGrade, HasLevel.Level.ONE);
        Student student = new Student("Kwame",studentGrade, HasLevel.Level.TWO);

        //then
        assertTrue(naughtyStudent instanceof Student);
    }

}