import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args){
    String str = "Hello";
    str.charAt(0);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number");
    int input = scanner.nextInt();
    System.out.println("input =" + input);

    scanner.close();
  }

  
}
