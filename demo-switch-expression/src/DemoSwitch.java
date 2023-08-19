public class DemoSwitch {

  // static final (constant)
  // instance variable
  // static variable
  // constructors
  // instance methods
  // static methods
  // private methods

  public static void main(String[] args) throws Exception {
    System.out.println(grade(90));
    Weekday weekday = Weekday.TUE;

    int result = switch (weekday) {
      case MON:
        System.out.println("Monday");
        yield 1;
      case TUE:
        System.out.println("Tuesday");
        yield 2;
      case WED:
        System.out.println("Wednesday");
        yield 3;
      case THU:
        System.out.println("Thursday");
        yield 4;
      case FRI:
        System.out.println("Friday");
        yield 5;
    };
    System.out.println(result);


    String str = "Hel";
    boolean result2 = switch (str.length()) {
      // case str -> "1";
      case 1 -> true;
      case 2 -> false;
      case 3 -> true;
      default -> false;
    };
    System.out.println(result2);
  }

  public static int getDayNumber(Weekday weekday) {

    switch (weekday) {
      case MON:
        System.out.println("Monday");
        return 1;
      case TUE:
        System.out.println("Tuesday");
        return 2;
      case WED:
        System.out.println("Wednesday");
        return 3;
      case THU:
        System.out.println("Thursday");
        return 4;
      case FRI:
        System.out.println("Friday");
        return 5;
    }
    return 1;
  }

  public static char grade(int score) {
    char grade = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 80:
        grade = 'B';
        break;
      case 70:
        grade = 'C';
        break;
      default:
        grade = 'F';
    }
    return grade;
  }
}
