import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args){
    // do-while, do first, then check condition to start looping
    /* int count = 0;
    do {
      System.out.println("hello, count=" + count);
      count++;
    } while (count < 3); */

    int input;
    Scanner scanner;

    do {
       scanner = new Scanner(System.in);
       String reminder = "Please input an integer:";
       System.out.println(reminder);
       input = scanner.nextInt();

       if (input % 2 == 0){
        System.out.println("Please input an odd integer");
       }

      // if input is even -> continue
      //odd -> exit loop and print the number
    } while( input % 2 ==0);
    System.out.println("Your input = " + input);

    // 1 - 100
    // bomb =45
    //user input: 30 -> 31 -100

    

  }
  
}
