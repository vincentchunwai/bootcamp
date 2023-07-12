public class conditional {
  public static void main(String[] args) {
    int i = 10;
    if (i > 9) {
      System.out.println("i = " + i);
    }
    // flow control: if-else
    if (i < 8) {
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i is larger than or equals to 8");
    }

    if (i > 12) {
      System.out.println("i > 12");
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >= 0");
    } else {
      System.out.println("i is negative");
    }

    int a = 2;
    int b = 5;
    int box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }

    int number = 11;
    if (number % 2 == 1) {
      System.out.println("number is a odd number");
    }
    if (number % 2 == 0) {
      System.out.println("number is an even number");
    }

    // String
    String str = "Monday";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    if (str.charAt(4) == 'd') {
      System.out.println("yes");
    }
    if (str.length() > 10) {
      System.out.println("length > 10");
    }
    if (str.equals("Monday") || str.charAt(4) == 'd' || str.length() > 10) {
      System.out.println("what is the result now?");
    }
    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else {
      grade = 'F';
    }
    //System.out.println(Math.sqrt(64));

    // switch
    int dayOfWeek = 3;
    String dayName = "";
    switch (dayOfWeek) { // check if value equals to the following cases
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
    System.out.println(3*10%3);



  }
}

