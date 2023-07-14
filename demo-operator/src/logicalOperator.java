public class logicalOperator {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    boolean result = isExpensive && isWorthToBuy; // false
    boolean result2 = isExpensive || isWorthToBuy; // true

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12; // false
    boolean result4 = a > 6 && b < 12 || c < 14; // true
    boolean result6 = a < 3 || b < 9 || c < 13; // true
    boolean result7 = a == b; // false
    boolean result8 = a >= 5; // true
    boolean result9 = c <= 13; // true
    // !=
    boolean result10 = c != 13; // false
    boolean result11 = !(c < 13); // true
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result6);

    int result13 = (1 + 9) * 3; // 30
    int result14 = ++result13 + 1; // 32
    int x = 5;
    int result17 = (x++ + 2) * x++;
    System.out.println(result17);

    int dayOfWeek = 3;

    String dayName = "";

    switch (dayOfWeek) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
    }
    System.out.println(dayName);



  }

}


