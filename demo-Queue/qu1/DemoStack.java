import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // First In Last Out

    Stack<String> stack1 = new Stack<>();
    stack1.push("abc");
    stack1.push("abc");
    stack1.push("abc");
    stack1.push("ABC");
    stack1.push("abc");
    stack1.push("111");
    stack1.push("abc");
    System.out.println(stack1);
    System.out.println(stack1.pop());
    System.out.println(stack1);
    stack1.add("BCD");
    stack1.add("DEF");
    System.out.println(stack1);

    while(!stack1.isEmpty()){
      System.out.print(stack1.pop());
      System.out.print(", ");
    }
  }
}
