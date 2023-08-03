
public class String3 {
  public static void main(String[] args) {
    String str = "abc";
    String str2 = "abc";
    System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
    System.out.println(str == str2); //true, address same???? 

    // equals check value
    // == check reference

    //String Literal Pool -> "abc"
    String str3 = "abcd";
    System.out.println(str == str3); // false
    System.out.println(str == str3); // false, their addresses are not same

    str = "abc123";
    // str2 = "abc"; // literal pool, immutability

    Integer a = 10;
    a= a + 20;
    // a = 30

    str = "abc100";

    System.out.println(str == str2); //false

    String temp = str;
    str = new String("abc100"); //new object
    temp = str;
    System.out.println(temp == str); //false
    System.out.println(temp == "abc100");
  }
}
