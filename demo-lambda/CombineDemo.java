import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate<String> startsWithV = str -> str.startsWith("V");
    Predicate<String> endsWithE = str -> str.endsWith("E");

    Predicate<String> combined = startsWithV.and(endsWithE);

    System.out.println(combined.test("VE"));
    System.out.println(combined.test("AE"));
    System.out.println();

    Predicate<String> combined2 = startsWithV.or(endsWithE);

    System.out.println(combined2.test("VE"));
    System.out.println(combined2.test("AE"));
  }
}
