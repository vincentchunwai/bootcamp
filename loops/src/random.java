import java.util.Random;
public class random {
  public static void main(String[] args){
    int randomNumber;
    
    Random random = new Random();
     randomNumber = random.nextInt(20);
    System.out.println(randomNumber);

    for (int i = 0; i < 6; i++){
       randomNumber = random.nextInt(20)+1;
       System.out.println("Random number =" + randomNumber);   

    }


  }
  
}
