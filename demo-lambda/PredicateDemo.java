import java.io.EOFException;
import java.time.LocalDate;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  
  public static void main(String[] args) throws Exception {
    Predicate<Character> isMale = c -> c == 'M';
    Predicate<String> isUpperCase = s -> {
      for (int i = 0; i < s.length(); i++){
        if (s.charAt(i) < 65 || s.charAt(i) > 90)
        return false;
      }
      return true;
    };
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUpperCase, "ABCDc", false);
    test(isUpperCase, "ABCDD", true);

    BiPredicate<String, String> equals = (s1, s2) -> s1 != null && s1.equals(s2);

    test(equals, "abc", "abd", false);
    test(equals, "bcd", "bcd", true);

    Predicate<LocalDate> isCoolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());

    test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
    test(isCoolingOff, LocalDate.of(2023, 7, 18), true);
  }

  public static <T> void test(Predicate<T> testcase, T data, boolean expectedResult) throws Exception{
    if(testcase.test(data) != expectedResult){
      throw new Exception("ERROR!!!!!!");
    }
  }
  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2, boolean expectedResult) throws Exception{
    if(testcase.test(data, data2) != expectedResult){
      throw new Exception("WRONG TESTCASE");
    }
  }
}
