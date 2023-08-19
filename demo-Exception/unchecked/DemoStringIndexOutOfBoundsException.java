package unchecked;
public class DemoStringIndexOutOfBoundsException {
  public static void main(String[] args) {
    try{
      "abc".charAt(3);
    } catch(StringIndexOutOfBoundsException e){
      System.out.println("String index issue");
    }
  }
}
