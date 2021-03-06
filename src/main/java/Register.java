import java.util.List;
import java.util.stream.Collectors;

public class Register {
    private List<Nameable>nameable;
    private List<HasLevel> studLevel;

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

    public List<String> getRegisterByLevel(Level level) {
        return nameable.stream()
                .filter(e->e.getLevel().equals(level))
                .map(Nameable::getName).toList();
    }

    public String printReport(){
        return nameable.stream().collect(Collectors.groupingBy(Nameable::getLevel)).toString();
    }

}
