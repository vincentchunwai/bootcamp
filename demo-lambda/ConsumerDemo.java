import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsumerDemo {
  
  public static void main(String[] args) {
    Consumer<String> consumer = str -> System.out.println(str);
    consumer.accept("I love java");
    Function<String, Integer> replace = str -> Integer.valueOf(str);
    Integer ii = replace.apply("1923");
    System.out.println(ii);

    System.out.println();

    BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + s2);
    biConsumer.accept("abc", "def");

    List<String> strings = new ArrayList<>();

    strings.add("dog");
    strings.add("cat");
    strings.add("cow");
    strings.add("bee");
    strings.add("chicken");

    strings.forEach(s -> {
      /* int i = 0;
      if (i < 1) */
      System.out.println(s);
    });
    System.out.println();

    strings.replaceAll(String::toUpperCase);

    strings.forEach(System.out::println);

    System.out.println();
    
    Comparator<String> lengthComparator = Comparator.comparingInt(String::length);

    List<String> sorted = strings.stream()
    .sorted(lengthComparator)
    .collect(Collectors.toList());
    System.out.println(sorted);

    Map<String, Integer>map = new HashMap<>();
    map.put("orange", 3);
    map.put("lemon", 2);
    map.put("watermelon", 5);
    map.forEach((key, value) ->{
      if ("lemon".equals(key))
      System.out.println(value);
    });

    
  }
}
