public class TestSynchronizedLock {

  int x;

  Object lock = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized (this.lock) {
      this.x++;
    }
    // this.increment();

    return total + this.x;
  }
  /*
   * public synchronized void increment(){
   * this.x++;
   * }
   */

  public static void main(String[] args) {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable formula = () -> {
      for (int x= 0; x < 100000; x++){
        obj.calculate(7);
      }
    };

    Thread thread = new Thread(formula);
    Thread thread2 = new Thread(formula);

    try{thread.join();thread2.join();}
    catch(Exception e){};

    System.out.println(obj.x);

  }
}
