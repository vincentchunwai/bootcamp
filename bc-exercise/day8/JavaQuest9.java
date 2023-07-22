/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    int position = str.indexOf('J');
    System.out.println(str.charAt(position));
    // prints e (the 1st e)
    int position2 = str.indexOf('e');
    System.out.println(str.charAt(position2));
    // code here ...

    // Use indexOf()
    // prints 3
    System.out.println(str.indexOf('t'));
    // prints 9
    System.out.println(str.indexOf('x'));
    // prints 10
    System.out.println(str.indexOf('L'));
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    System.out.println(str.replace("Java", "Coding"));
    // code here ...

    // int length()
    // prints 19
    System.out.println(str.length());
    // code here ...

    // Use String substring(int start, int end)
    // prints "ren"
    System.out.println(str.substring(5, 8));
    // code here ...

    // print "VENTURENIXLAB, JAVA"
    System.out.println(str.toUpperCase());
    // prints "venturenixlab, java"
    System.out.println(str.toLowerCase());
    // code here ...

    // Method Chaining (one line to complete)
    System.out.println(str.toUpperCase().replace('E', '*'));
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...

  }
}