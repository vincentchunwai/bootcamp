/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int firstNum = 0;
    int SecondNum = 1;
    int NextNum = 0;
    for (int i = 0 ; i<16; i++){
      NextNum = firstNum + SecondNum;
      firstNum = SecondNum;
      SecondNum = NextNum;
      System.out.print(firstNum + " ");
    }
  }
}
