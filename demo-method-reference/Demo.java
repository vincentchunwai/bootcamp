import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
  public static void main(String[] args) {
    Consumer<String> sysout = s -> System.out.println(s);
    Consumer<String> sysout2 = System.out::println;

    sysout2.accept("Hello");

    Arrays.asList("abc", "def").forEach(sysout2);

    String name = "Tom";
    Supplier<Integer> strLength = () -> "abc".length();
    Supplier<Integer> strLength2 = name::length;
    strLength2.get();
    System.out.println(strLength2.get());

    List<String> words = Arrays.asList("apple", "banana", "orange");

    Comparator<String> c = (s1, s2) -> s2.compareTo(s1);
    Comparator<String> c2 = String::compareTo;

    Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
    Function<String, Integer> stringToInteger2 = Integer::valueOf;

  }
}
