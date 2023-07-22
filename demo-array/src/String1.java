public class String1 {
  public static void main(String[] args){
    // length(), equals(), charAt()
    // isEmpty()
    String str = "Hello";
    System.out.println(str.isEmpty()); // false
    String str2 = "";
    System.out.println(str2.isEmpty()); // true
    String str3 = "   ";
    System.out.println(str3.isEmpty()); // true

    //isBlank()
    System.out.println(str.isBlank());
    System.out.println(str3.isBlank( ));

    System.out.println(str.toUpperCase()); //HELLO
    System.out.println(str); //hello
    System.out.println(str.toUpperCase().toLowerCase()); //hello

    // substring
    //hello -> he

    System.out.println(str.substring(0, 5));
    System.out.println(str.substring(2));
    System.out.println(str.substring(2,5));
    if (str.substring(0,3).equals("Hel")){
      System.out.println("yes");
    }

    //contains()
    String s = "lo";
    System.out.println(str.contains(s));//
    System.out.println(str.contains("ol"));// false (hello not contain ol)
    System.out.println(str.contains("llo"));

    str = str.toUpperCase();
    System.out.println(str);
    str += str.toLowerCase();
    System.out.println(str);
  }
  
}
