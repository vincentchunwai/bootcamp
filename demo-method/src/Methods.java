public class Methods {
  int a;
  int b;

  public Methods(int a, int b) {
    this.a = a;
    this.b = b;

  }

  public static void print() { // method name: print()
    System.out.println("Hello in print() method");

  }

  public static int sum(int a, int b) {
    // left int = return type
    // the int inside the bracket are parameters

    return a + b;
  }

  public static int substract(int a, int b) {
    return a - b;
  }

  public static void method2(String str) {
    if (str == null || "".equals(str)){
      return;
    }
    System.out.println("String = " + str);
  }

  public static double pi(){
    return 3.14159;
  }

  public static void main(String[] args) { // method name: main()
    String str = "hello";
    str = str + " world"; // append operation

    // Approach 1
    System.out.println("Hello in print() method");
    // Approch 2: by method
    print(); // print "Hello in print() method"

    int x = 10;
    int y = 100;
    int sum = x + y; // 110

    // approach 2
    int z = sum(x, y); // z = 110
    int i = sum(1000, -30); // 970
    // int o = sum("hello", 123); //error

    if (i == 970) {
      System.out.println("the sum is 970");
    }
    int k = substract(920, 198);
    System.out.println(k);

    method2("hello");
    method2("Github");

    double circleArea = 5 * 5 * pi();
    System.out.println("circle area = " + circleArea);

  }
}
