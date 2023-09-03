import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    
    persons.add(new Person("John Lau", null));
    persons.add(new Person("Simon Chan", null));
    persons.add(new Person("Eric Lau", null));

    List<Person> lau = persons.stream().filter(p -> p.getName().endsWith("Lau")).collect(Collectors.toList());
    System.out.println(lau);
  }
}
