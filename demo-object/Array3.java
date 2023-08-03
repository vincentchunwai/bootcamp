import java.util.Arrays;

public class Array3 {

  public static void addOne(int[] arr){ // Pass by reference
    for (int i = 0; i < arr.length; i++){
        arr[i] += 1;
    }
  }

  // All Wrapper Class + String -> Pass by value
  public static String concat(String s1, String s2){ // pass by value
    s1 = "hello";
    return s1 + s2;
  }
  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums);
    System.out.println(Arrays.toString(nums));

    // Call concat
    String a = "abc";
    String b = "def";
    String result = concat(a, b); // hellodef
    System.out.println(result);
    // a = abc **// didn't change the original value 
    // b = def
  }
  
}
