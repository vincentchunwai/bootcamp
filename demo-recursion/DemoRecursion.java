public class DemoRecursion {

  public static void main(String[] args) {
    int num = 9;
    System.out.println(sum2(num));
    print(num);

  }


  // Question 1:
  // k + (k - 1) + (k-2) + .... + 0
  public static int sum(int k) {
    if (k < 1)
      return k;
    return k + sum(k - 1);

    // 15, return
    // sum(10), No return
    // 5 + sum(4), no return
    // 5 + sum(3), no return
    // 3 + sum(2), no return
    // 2 + 1; return
    // 1 + 1, return;
    // 0 < 1, return 0;
  }

  // Question 2:
  // 0, 1, 1, 2, 3, 5, 8, 13... k time
  // k = 7, return 8
  public static int sum2(int k) {
    if (k <= 1)
      return k;
    return sum2(k - 1) + sum2(k - 2);
  }

  // Question 3:
  // non-tail recursion
  // 3 2 1 1 2 3, k = 3
  public static void print(int k) {
    if (k < 1){
      return;
    }
    System.out.print(k + " ");
    print(k-1);
    System.out.print(k + " ");
  }
}

