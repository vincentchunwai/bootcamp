import java.util.Arrays;

public class intstring {
  public static void main(String[] args){
    String str = "Hello World";
    str = str.toLowerCase();
    char[] converted = str.toCharArray();
    int[] strNum = new int[converted.length];
    for (int i =0; i< converted.length; i++){
      strNum[i] = converted[i];
    }
    System.out.println(Arrays.toString(strNum));
  }
  
}
