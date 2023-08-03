package Shape;

public class Revision {

  String name; //address

  public void print(String input){
    System.out.println("hello" + input + " " +this.name);
  }
  public static void print1(String input){
    System.out.println("hello" + input);
  }
  
  public static void main(String[] args) {
    Revision r1 = new Revision();
    r1.name = "John";
    Revision r2 = new Revision();
    r2.name = "John";
    System.out.println(Character.valueOf('6'));

    /* r1.print(" world");
    Revision.print1(" world");

    r2.name = new String("John"); */
    System.out.println(r1.name == r2.name);
    System.out.println(r1.equals(r2));
/* 
    System.out.println(r1 == r2); // false
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1 == s2);

    String s3 = new String("abc");
    System.out.println(s1 == s3);

    Integer i1 = 127;
    Integer i2 = 127;
    System.out.println(i1 == i2);
    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);

    String temp = s1;
    s1 += "d"; // immutable
    System.out.println(temp == s1); */
  }
  
}
