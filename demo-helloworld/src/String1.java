public class String1 {
  public static void main(String[] args){
    String str = "I am happy, but raining";
    str = str + ".";
    System.out.println(str);// I am happy, but raining.

    //Method
    int i = str.length();
    System.out.println("i=" + i);

    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2);
    boolean areTheyEqual2 = str1.equals(str3);
    System.out.println(str1 == str2);
    System.out.println(areTheyEqual);
    System.out.println(areTheyEqual2); 

    // 
    String str4 = "helloworld";
    System.out.println(5 == str4.charAt(2));



    
  
  }
}
