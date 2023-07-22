public class loops {
  public static void main(String[] args){
    //For Loop
    
    //for(int i = 0; i < 10; i+=2){
      //System.out.println("Hello");
      // i = 0, 1st Hello;
      // i = 0, 2st Hello;
      // i = 0, 3st Hello;
      // i = 0, 4st Hello;
       int sum = 0;
       for(int i = 0; i < 10; i++){
        if (i%2 == 1){
          sum += i;
        }
        
       }

       /*for (int i = 0; i < 6; i++){
        System.out.println("Hello!");
        if(i>3){
          continue;// go to the next iteration
        }
        System.out.println("Bye!");
       }*/
       // i = 0, hello, bye
       // i = 1, hello, bye
       // i = 2, hello, bye
       // i = 3, hello,bye
       // i = 4, hello
       // i = 5, hello
       // i = 6, exit

       /*for (int i = 0; i<4; i++){
        for (int j = 0; j < 3; j++){
          System.out.println("Hello");
        }
       }*/
        /*for (int y = 0; y<5; y++){
        for (int x = 0; x<y + 1; x++){
          System.out.print('*');
        }
        System.out.println("");*/
        
        
        /*for(int i = 0; i < 5; i++){
          System.out.println(str);
          str += '*';
        }*/

        String str = "*";

          for(int i = 0; i < 5; i++){
          System.out.println(str);
          for(int x = 0; x<=i; x+=4){
             str += '*';
            
             
             
             
             }
          }
  }}



