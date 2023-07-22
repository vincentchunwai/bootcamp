import java.util.Arrays;

public class ForEach{
  public static void main(String[] args){
    for (int i = 0; i < 3; i++){
      System.out.println("basic for-loop: Hello");
    }
    // For-each
    // Difference of for-each:
    // 1. for-each do not have stop condition/ counter in loop signature
    int[] arr = new int[] {1, 13, 3, 4};
    // for (:dataset)
    for (int x : arr){
      System.out.println("for-each: = " + x);
      System.out.println(arr[0]); // but you still access element by index
      // modification
      arr[0] = 100;
    }
    for (int i = 0; i < 4; i++){ // counter
      System.out.println("for-each: Hello");
    }
    //
    String[] strs = new String[] {"hello", "world"};
    for (String x : strs){
      System.out.print(x + " ");
    }
    // Integer, Character (Wrapper Class)
    Character[] chars = new Character[] {'L', 'a', '!', '('};
    for (Character c : chars){
      System.out.println(c);
    }

    String s2 = "Hello, world ! I am Vincent";
     String[] strings = s2.split(" ");
    for (String s : strings){
      System.out.println(s);
    } 
    System.out.println(strings[0]);
    //
    char[] strings2 = s2.toCharArray();
    int spaceNum = 0;
   // int[] breakposition = new int[strings2.length];
    for (int i = 0; i < strings2.length-1; i++){
      if (strings2[i] == ' '){
  //      breakposition[i] = i;
        spaceNum++;
      }
    }
    int looptime = 0;
    String[] newString = new String[spaceNum+1] ;
    newString = remove(newString);
    System.out.println(Arrays.toString(newString));
      for (int i = 0; i < strings2.length; i++){
      newString[looptime] += String.valueOf(strings2[i]);
      if (strings2[i] ==' '){
        looptime++;
      }
    } 
    System.out.println(Arrays.toString(strings2));
    System.out.println(Arrays.toString(newString)); 

  }
  public static String[] remove(String[] arr){
    for (int i = 0; i < arr.length; i++ ){
      arr[i] = "";
    }
    return arr;
  }
}