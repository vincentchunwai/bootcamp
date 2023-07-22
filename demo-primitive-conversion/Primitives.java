import java.util.Arrays;

public class Primitives {
  public static void main(String[] args){
    //Correct Syntax
    //Upcasting (implicit conversion/ Promotion)
    // byte --> short --> int --> long --> float --> double
    // char --> int
    byte b = 2;
    short s = b; // byte --> short, upcasting (promotion)
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    char c = 'A';
    int j = c;
    char[] charArray = new char[]{'g', 'k', 'l', 'n'};
    String stringRe = new String(charArray).toString();
    System.out.println(stringRe);
    System.out.println("j = " +  j);

    //Downcasting
    double d2 = 10.3d;
    // float f2 = d2; double's precision is more accurate than float
    float f2 = (float) d2; // developer take responsiblity for the loss of accuracy
    System.out.println(f2);

    /* short s2 = 128;
    byte b2 = (byte) s2;
    System.out.println("b2 = " + b2); //-128

    for (byte k = 127; k < 129; k++){ // 128 --> -128
      System.out.println("Hello");

    long[] arr = new long[(int) Long.MAX_VALUE];
    for (int n = 0; n < arr.length; n++){

    }
    int random = Integer.MIN_VALUE; */

    char c2 = 'B'; //6
    if (c2 == 'B'){
      System.out.println("c2 is B");
    }
    if (c2 == 66){
      System.out.println("c2 is 66");
    }
    char c3 = 67;
    if (c3 == 'C'){
      System.out.println("c3 is C");
    }

    // ASCII (int) to char
    int g = 'a';
    char k = (char)g; // downcasting, Explicit conversion
    System.out.println("k = " + k);
    char k2 = 66; // 66 is ASCII code

    //
    int h = (int) 1000L; // downcasting, Explicit conversion
    byte o = 9;
    short s10 = 128;
    byte o2 = (byte) s10;
    System.out.println("o2 = " + o2);
    // byte o2 = 128; // error

    char character = 'a' + 1;
    if (character == 'b') {
      System.out.println("character = " + character);
    }
    if (character > 'a' && character < 'c'){
      System.out.println("character > a and < c");
    }
    char ks = 253;
    System.out.println(ks);

    }
}
