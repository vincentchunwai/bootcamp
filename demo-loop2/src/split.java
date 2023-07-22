import java.util.Arrays;

public class split {
  public static void main(String[] args){
    String s2 = "Hello, world ! I am Vincent";
    int spaceCount = 0;
    for (int i = 0; i < s2.length(); i++){
      if(s2.charAt(i) == ' '){
        spaceCount++;
      }
    }
    int startIndx = 0;
    int idx = 0;
    String[] result = new String[spaceCount + 1];
    for (int i = 0; i < s2.length(); ++i){
      if (s2.charAt(i) == ' '){
        result[idx] = s2.substring(startIndx, i);
        idx++;
        startIndx = i + 1;
      } else if (i == s2.length()-1){
        result[idx] = s2.substring(startIndx, s2.length());
      }
    }
    System.out.println(Arrays.toString(result));
  }
  
}
