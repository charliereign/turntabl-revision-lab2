import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

   @Test
    public void calculateAverage(){
       //given
       List<Double>studentGrade = List.of(1.0,2.0,3.0,4.0,5.0);
       Double expected = studentGrade.stream().reduce(0.0,Double::sum)/studentGrade.size();

       //when
       Double average = new Student("Kwame",studentGrade, Level.THREE).getAverageGrade();

       //then
       assertEquals(expected,average);
   }

}