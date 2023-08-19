public class TestString {
  String str = "";
  public static void main(String[] args) {
    TestString str = new TestString();
    Runnable test1 = () -> {
      for (int i = 0; i < 1000; i+=2){
        System.out.println(str.str);
        if (i % 2 == 0)
        str.str += "**";
        else
        str.str += 1;
      }
    };
    Runnable test2 = () -> {
      for (int i = 0; i < 1000; i++){
        System.out.println(str.str);
        if (i % 2 == 0)
        str.str += "!";
        else
        str.str += 2;
      }
    };
    Runnable test3 = () -> {
      for (int i = 0; i < 1000; i++){
        System.out.println(str.str);
        str.str += "A";
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
    System.out.println("Simulation ends");
  }
}
