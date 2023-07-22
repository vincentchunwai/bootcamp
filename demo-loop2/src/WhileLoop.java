public class WhileLoop {
  public static void main(String[] args) {
    // while
    /*
     * int count = 0; while (count<5) { // continue condition: true/ false count++; System.out.println("count = " + count); } // count = 5
     */
    int counter = 1;

    boolean isHoliday = false;
    /*
     * while(!isHoliday){//Not Holiday System.out.println("counter = "+ counter); counter++; if (counter >= 6){ isHoliday = true; System.out.println("counter = "+ counter);
     * System.out.println("isHoliday = " + isHoliday); } }
     */
    while (counter < 7) {// Not Holiday
      System.out.println("counter = " + counter);
      System.out.println("isHoliday = " + isHoliday);
      counter++;
      if (counter > 5) {
        isHoliday = true;
        System.out.println("counter = " + counter);
        System.out.println("isHoliday = " + isHoliday);
      }
    }
    int c = 0;
    while (c > 0 && c < 5) {
      System.out.println(c);
      c++;
    }
    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) { // while a >=5, (false || true)
      System.out.println("hello");
      a++;
      b--;
    }

    // break, continue;
    int k = 0;
    while (k < 6) {
      System.out.println("break: Hello");
      k++;
      if (k > 3) {
        break;
      }
    }
    int j =0;
    while (j < 6){
      j++;
      if (j>3){
        continue;
      }
      System.out.println("continue: hello");
      //
    }
  }

}
