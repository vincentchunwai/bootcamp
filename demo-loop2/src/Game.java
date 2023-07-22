import java.util.Random;
import java.util.Scanner;
public class Game {
  public static void main(String[] args){
    // 1-100
    //bomb = 45 (random number)
    // user input : 30 -> 31 -100

    Scanner scanner = new Scanner(System.in);
    int bomb = new Random().nextInt(100) + 1;
    int input;
    int min = 1;
    int max = 100;
    do {
      System.out.println("please input a number" + "(" + min + "-" + max + ")" );
      input = scanner.nextInt();
      if ( input > 100 & input < 1){
        System.out.println("please input a number (1 - 100)");
      }
      if ( input < bomb){
        min = input + 1;
      }
      if ( input > bomb){
        max = input - 1;
      }

      

    } while ( input != bomb);
    System.out.println("Bomb!");
  }
  
}
