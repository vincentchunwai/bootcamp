import java.util.Arrays;
import java.util.List;

public class math{
  public static void main(String[] args) {
    System.out.println(Math.round(5.4));
    System.out.println(Math.round(5.5));
    System.out.println(Math.round(5.44));
    System.out.println(Math.round(5.55));
    double squareRoot = 26;
    System.out.println(Math.sqrt(squareRoot));

    int num = -26;
    if (num > 0 && Math.sqrt(num) == 5){ // if num <= 0, exit
      // dosomething
    }

    Math.random(); // 0.0 - 1.0

    //base10;
    // log10 -> 1
    // log1000 -> 3
    //base2:
    //log8 -> 3
    double number = 2.0;
    double naturallog = Math.log(number);
    System.out.println(naturallog);

    System.out.println(Math.log10(1000)); // 3.0

    int[] nums = new int[] {-100, 100, 90, 50};
    int sum = 0;
    for (int i : nums){
      sum += Math.abs(i);
    }
    System.out.println(sum);

    double[] arr = new double[] {-5.65, 5.23, 9.800, 6.55};
    double sum1 = 0;
    for (double k : arr){
      sum1 += Math.round(Math.abs(k));
    }
    System.out.println(sum1);

    int cubeLength = 3;
    double volume = Math.pow(cubeLength, 3);
    System.out.println(volume);

    int[] bases = new int[] {2, 3, 4, 5};
    int[] index = new int[] {3, 4, 5, 6};
    int[] result = new int[bases.length];
    String[] ss = new String[bases.length];
    for (int i = 0; i < bases.length; i++){
      ss[i] = String.valueOf(bases[i]);
    }
    StringBuilder temp = new StringBuilder();
    temp.append("abb");
    temp.reverse();

    System.out.println(index[]);
    

    
    int i = 0;
    while (i < bases.length){
      result[i] = (int) Math.pow(bases[i], index[i]);
      i++;
    }
    System.out.println(Arrays.toString(result));
  }
}