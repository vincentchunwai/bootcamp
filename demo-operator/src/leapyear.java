import java.util.Scanner;

public class leapyear {
  public static void main(String[] args){
    int Year;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the year.");
    Year = scanner.nextInt();

    boolean leapYear = (Year % 4 == 0 && Year % 100 != 0 || Year % 400 ==0);

    if (leapYear = true) {
      System.out.println(Year +" is a leap year");
    } else {System.out.println(Year +" is not a leap year");};

    scanner.close();

    
  }
  
}
