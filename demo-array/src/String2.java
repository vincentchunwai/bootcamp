import java.util.Arrays;
public class String2 {
  public static void main(String[] args) {
    String str = "     Hello";
    String str2 = "  hel  lo  ";
    System.out.println("str.trim()= " + str2.trim()); // "hello"
    System.out.println("str.trim()= " + str.trim());

    // startsWith(), check if the string start with the target string
    if (str.startsWith("hel")) {
      System.out.println("The String starts with hel");
    }
    boolean endsWithSpace = str.endsWith(" ");
    if (endsWithSpace) {
      System.out.println("The String starts with space");
    }

    //*** indexOf ***//
    // indexOf(char)
    System.out.println("The index of o in str =" + str.indexOf('o'));
    // indexOf(String)
    System.out.println("The index of ll in str =" + str.indexOf("ll"));
    System.out.println("The index of lll in str =" + str.indexOf("lll")); //-1
    System.out.println("The index of o in str, search From index 5= " + str.indexOf('o', 5)); //9
    System.out.println("The index of ll in str, search From index 3=" + str.indexOf("ll", 3)); //7
    String copy = str.substring(0);
    System.out.println(copy);

    //last occurence of the char/ String in String
    System.out.println(str.lastIndexOf('l')); //8
    System.out.println(str.lastIndexOf("ll")); //7
    System.out.println(str.lastIndexOf('l', 9));//8

    // replace
    String sstr = "Java is a programming language";
    sstr = sstr.replace("Java","C++");
    System.out.println(sstr);
    sstr = sstr.replace('a', 'k');
    System.out.println(sstr);
    int[] random = new int[] {1, -1, 290, 28, 5};
    // equals(), euqalsIgnoreCase()
    String str3 = "Hello";
    if ("Hello".equals(str3)){
      System.out.println("str3 = Hello");
    }
    if ("Hello".equalsIgnoreCase(str3)){ //true, non case sensitive
      System.out.println("str3 = Hello(Non case sensitive check)");
    }
    
    if ("HELLO".equals(str3.toUpperCase())){
      System.out.println("Alternative");
    }

    //concat(String), append something
    String newString = str3.concat(" Java!");
    System.out.println(newString);

    // compareTo
    String apple = "apple";
    String facebook = "facebook";
    System.out.println(apple.compareTo(facebook)); // 97 - 105 ('a' - 'f') = -5

    
  }

}
