import java.util.Random;

public class Random1 {
  public static void main(String[] args){
    int num = new Random().nextInt(1, 4); // 0 or 1 or 2
    System.out.println(num);
    char random = randomABCDE();
    System.out.println(random);
  }

  public static char randomABCDE(){
    /* char [] ABCD = new char[] {'A', 'B', 'C', 'D', 'E'};
    int idx = new Random().nextInt(5);
    return ABCD[idx]; */
    return (char) (new Random().nextInt(5) +65);
  }
  
}
