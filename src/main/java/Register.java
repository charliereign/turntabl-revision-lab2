import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Nameable>nameable;

    public Register(List<Nameable> nameable) {
        this.nameable = nameable;
    }

    @Override
    public String toString() {
        return "Register{" +
                "nameable=" + nameable +
                '}';
    }

    public List<String> getRegister(){
        return nameable
                .stream()
                .map(Nameable::getName)
                .toList();
    }

//    public List<String> getRegisterByLevel(HasLevel.Level level){
//        nameable.stream().forEach();
//    }
}
