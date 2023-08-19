import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
  
  public static void main(String[] args) throws Exception{
    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get());
    test( now, LocalDate.of(2023, 8, 16));

    Supplier<Integer> random = () -> new Random().nextInt(3);
    System.out.println(random.get());
  }

  private static void test(Supplier<LocalDate> now, LocalDate of) {}

  public static <T> void test(Supplier<T> testcase, T result)throws Exception{
    if (testcase.get().equals(result))
    return;
    throw new Exception();
  }
}
