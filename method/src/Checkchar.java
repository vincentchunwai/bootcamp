import java.util.Arrays;

public class Checkchar {
  public static void main(String[] args) {
    char char1 = 'i';
    char char2 = 2;
    char char3 = 'L';
    CharacterAnalysis checker = new CharacterAnalysis();
    checker.checkChar(char3);
    checker.checkChar(char1);
    checker.checkChar(char2);
    int num = 80;
    ShortAndChar.ASCII(num);
    ShortAndChar.ascii(char3);
    ShortAndChar.ascii(char2);
    String a= "hello";
    System.out.println(a.indexOf('e'));
   char[] b = a.toCharArray();
   a.replaceAll("^[0-9]", "");
   System.out.println(a);
   int[] intArray = {1, 2, 3};
   String joined = Arrays.stream(intArray);
   
  }
  
}
