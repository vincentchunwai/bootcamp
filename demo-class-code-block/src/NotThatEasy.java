import java.util.ArrayList;
import java.util.List;

public class NotThatEasy {
  
  static final List<Character> characters = method();
  private static final char[] chars = {'j', 'a', 'c', 'k', 'y'};

  final int x = method2();
  
  static List<Character> method(){
    System.out.println("I am static method, called by instance variable");
    return new ArrayList<>();
  }

  static int method2(){
    System.out.println("I am static method, called by instance variable");
    return 1;
  }

  static {
    System.out.println("I am static code block");
  }
  {
    System.out.println("I am initialization code block");
  }

  public static void main(String[] args) {
    // Once you click the run button:
    // 1. Compile
    // 2. Run -> Class loader -> stack memory
    System.out.println("Start of main");
    NotThatEasy obj = new NotThatEasy();
    NotThatEasy obj2 = new NotThatEasy();
  }
}

