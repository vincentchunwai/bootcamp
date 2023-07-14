import java.util.Scanner;

public class palindrome {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String wordInput = scanner.nextLine();
    int wordlength = wordInput.length();


    for (int i = 0; i < wordlength; i++ ){
      if (wordInput.charAt(i) != wordInput.charAt(wordlength-=1)){
        System.out.println("This is not a palindrome.");
        break;
      } else {System.out.println("This is a palindrome.");
        break;}
        
      }


    }

  }
  

