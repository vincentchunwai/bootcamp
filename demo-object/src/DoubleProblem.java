

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result);


    if (result == 0.3)
      System.out.println("result = 0.3");
    else
      System.out.println("result != 0.3");

    System.out.println(0.3 / 0.1);
    System.out.println(0.2 * 0.1);

    // Solution:
    BigDecimal b = new BigDecimal(0.3);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b3 = 5.0; // Not ok
    Double d = 5.0d;

    System.out.println(b.multiply(b));
    System.out.println(b.subtract(b2));
    System.out.println(b.add(b));
    System.out.println(b.divide(b));
    System.out.println(b.add(new BigDecimal(0.4)));

    BigDecimal b3 = BigDecimal.valueOf(3.456);
    System.out.println(BigDecimal.valueOf(0.3+0.4));
    System.out.println(b3.setScale(2, RoundingMode.UP));
    System.out.println(b3.setScale(2, RoundingMode.DOWN));

    System.out.println(b.equals(b2));
    BigDecimal b4 = BigDecimal.valueOf(5);
    System.out.println(b.equals(b4));
    System.out.println(b == b4);

    /* if (b.compareTo(b2) == 1){
      System.out.println("true");
    } else {System.out.println("false");}
    System.out.println(b.compareTo(new BigDecimal(5)));
 */

  }
}
