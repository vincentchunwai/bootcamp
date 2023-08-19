import java.util.Vector;

public class TestVector {
  Vector<Integer> integers = new Vector<>();
  public static void main(String[] args) {
    TestVector str = new TestVector();
    Runnable test1 = () -> {
      for (int i = 0; i < 1000; i+=2){
        if (i % 2 == 0)
        str.integers.add(2);
        else
        str.integers.add(1);
      }
    };
    Runnable test2 = () -> {
      for (int i = 0; i < 1000; i++){
        if (i % 2 == 0)
        str.integers.add(2);
        else
        str.integers.add(1);
      }
    };
    Runnable test3 = () -> {
      for (int i = 0; i < 1000; i++){
        if (i % 2 == 0)
        str.integers.add(2);
        else
        str.integers.add(1);
      }
    };

    Thread thread = new Thread(test1);
    Thread thread2 = new Thread(test2);
    Thread thread3 = new Thread(test3);

    thread.run();
    thread2.run();
    thread3.run();

    try{
      thread.join();
      thread2.join();
      thread3.join();
    } catch (InterruptedException e){

    }
    System.out.println(str.integers.size());
  }
}
