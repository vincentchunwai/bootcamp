public class ShortAndChar {
  public static void ASCII(int num){
    String binaryString = Integer.toBinaryString(num);
    System.out.println("Binary representation of your number" + binaryString);
  }

  public static void ascii(char Anychar){
    int asciiValue = (int) Anychar;
    System.out.println("The ASCII value of char" + Anychar + "is "+ asciiValue);
  }
  
}
