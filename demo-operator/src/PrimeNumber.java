import java.util.Scanner;
public class PrimeNumber {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
    num = scanner.nextInt();
    for (int i = 1; num > i; i++) {
      if (num % i != 0){
        System.out.println("This is a prime number");
      } break;

    };
    scanner.close();

    }

  }
  

