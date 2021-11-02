import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    public void testRegisterMethod(){
        //given
        List<Double>samGrade = List.of(1.0,2.0,3.0,4.0,5.0);
        List<Double>georgeGrade = List.of(1.0,2.0,3.0,4.0,5.0);
        List<Double>amaGrade = List.of(1.0,2.0,3.0,4.0,5.0);
        List<Double>janeGrade = List.of(1.0,2.0,3.0,4.0,5.0);

        //when
        List<Nameable> nameable = List.of(
                new Student("Sam",samGrade, HasLevel.Level.TWO),
                new Student("George",georgeGrade, HasLevel.Level.ONE),
                new Student("Ama",amaGrade, HasLevel.Level.THREE),
                new Student("Jane",janeGrade, HasLevel.Level.ONE)
        );

//        Register register = new Register(nameable);
//        System.out.println(register.getRegister());

        List<String> expected = List.of("Sam", "George", "Ama", "Jane");

        //then
        assertEquals(expected,new Register(nameable).getRegister());
    }
}