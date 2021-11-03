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
                new Student("Sam",samGrade, Level.TWO),
                new Student("George",georgeGrade, Level.ONE),
                new Student("Ama",amaGrade, Level.THREE),
                new Student("Jane",janeGrade, Level.ONE)
        );

        Register register = new Register(nameable);
        System.out.println(register.printReport());

        List<String> expected = List.of("Sam", "George", "Ama", "Jane");

        List<String> expectedName = List.of("Ama");

        //then
        //assertEquals(expected,new Register(nameable).getRegister());

        //testing the getRegisterByLevel method
        assertEquals(expectedName,new Register(nameable).getRegisterByLevel(Level.THREE));
    }


}