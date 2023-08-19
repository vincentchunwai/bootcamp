public class DemoThread {
   public static void main(String[] args) {
      // Approach 1: Runnable to implement Thread
      // Task Logic

      
      Runnable printout = ()-> {
         for (int i = 0; i < 100; i++){
            System.out.println("i=" + i);
         }
      };
      //Runnable printout = () -> System.out.println("Hello World");;

      // Task
       Thread thread = new Thread(printout); // Task Management
      System.out.println("start thread");// step 1
      thread.start(); // step 2
      System.out.println("end thread"); /// step 3

      // Approach 2 : create PrintOut Class implamentes Ruunable
     Thread thread2 = new PrintOutTwo();
     System.out.println("startThread2");
     thread2.start();
     System.out.println("end thread 2");

     //Approach 3: Create Printout2

     
     Thread thread3 = new Thread(new PrintOutTwo());
     

     try{
      thread.join();
      thread2.join();
      thread3.join();
     } catch (InterruptedException e){

     }
     System.out.println("Main Thread Ends");

   
   }
}
