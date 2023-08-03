import java.util.Arrays;

public class Strings implements CharSequence{

  char[] arr; // "abc", [a, b, c]

  public Strings(String str){
    this.arr = str.toCharArray();
  }

  public static Strings valueOf(String str){
    return new Strings(str);
  }

  @Override 
  public int length(){
    return arr.length;
  }

  @Override
  public char charAt(int idx){
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end){
    if (end < start || start < 0 || end < 0 || end > this.arr.length
    || start > this.arr.length-1 || start > this.arr.length-1)
    return String.valueOf(this.arr);
    // return String, StringBuilder, StringBuffer
    StringBuilder sb = new StringBuilder();
    for(int i = start; i < end; i++){
      sb.append(this.arr[i]);
    }
    return sb.toString();
  }


  public static void main(String[] args) {
    String str = "abc";
    Strings s = Strings.valueOf("abc");
    System.out.println(s.charAt(0));

    System.out.println(s.subSequence(1, 3));
  }
  
}
