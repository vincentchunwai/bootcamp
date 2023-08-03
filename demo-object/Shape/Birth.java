package Shape;

import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today); // 2023-07-28
    LocalDate specifiDate = LocalDate.of(2023,Month.FEBRUARY , 28);
    System.out.println(specifiDate);
    System.out.println(LocalDate.parse("2023-12-30"));

    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.println(d1.getYear());
    System.out.println(d1.getMonth());
    Month result = d1.getMonth();
    System.out.println(result.getValue());
    System.out.println(d1.getDayOfMonth());
    System.out.println(d1.getDayOfWeek());
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear());
    System.out.println(d1.plusMonths(3L));
    System.out.println(d1.plusWeeks(9L));

    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023, 7, 20);
    if(LocalDate.now().isAfter(effectiveDate.plusMonths(3L))){
      expiry = true;
    }
    System.out.println(expiry);
  }
  
}
