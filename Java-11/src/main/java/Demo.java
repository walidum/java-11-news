import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

     }

      public static List<String> newStringMethods (){
        String multilineString = "All Algeria \n \n Java \n Community.";
        return multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
    }
}
