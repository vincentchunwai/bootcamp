public class TestSynchronized {

  int number;

  public synchronized void increment(){
    this.number++;
  }
  public static void main(String[] args) {
    TestSynchronized i = new TestSynchronized();
    //i.number++; // Non-Atomic Operation
    //System.out.println(i.number); // 1

    Runnable increment = () -> {
      for (int k = 0; k < 100000; k++){
        i.increment(); // Atomic Operation
      }
    };
    Runnable increment2 = () -> {
      for (int k = 0; k < 100000; k++){
        i.increment();
      }
    };
    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment2);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    } catch (InterruptedException e){

    }
    System.out.println(i.number);
  }
}
