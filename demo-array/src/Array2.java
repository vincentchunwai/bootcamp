import java.util.Arrays;

public class Array2 {
  public static void main(String[] args){
    System.out.println(swap("hello", 2, 4));

  }
  public static String swap(String str, int idx1, int idx2){
    if (str == null){
      return null;
    }
    if (str.isBlank()){
      return str;
    }
    if (idx1 < 0 || idx1 >= str.length()){
      return str;
    }
    if (idx2 < 0 || idx1 >= str.length()){
      return str;
    }
    char[] swapped = str.toCharArray();
    char temp = swapped[idx1];
    swapped[idx1] = swapped[idx2];
    swapped[idx2] = temp;
    return String.valueOf(swapped);
  }
   
}
