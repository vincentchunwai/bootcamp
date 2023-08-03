import java.util.Arrays;

public class C extends B{
  
  public void print(int[] arr){
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    // 
    C c = new C();
    c.num = 10;
    c.str = "hello";
    c.setNum(100);
    c.setString("ABC");

    c.print(5); // 100 5
    c.print("def"); // abc def
    c.print(new int[] {-1, 0, 2}); // [-1, 0, 2]
  }
}
