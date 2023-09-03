
public class StringBuffer1 {
  
  public static void main(String[] args){
    StringBuffer sbuilder = new StringBuffer("");

    Runnable appendS = () -> {
      for (int x = 0; x < 10000; x++){
        sbuilder.append("s");
      }
    };

    Thread thread1 = new Thread(appendS);
    Thread thread2 = new Thread(appendS);

    thread1.start();
    thread2.start();

    try{thread1.join();
    thread2.join();}
    catch(Exception e){

    }
    

    System.out.println(sbuilder.length());
  }
}
