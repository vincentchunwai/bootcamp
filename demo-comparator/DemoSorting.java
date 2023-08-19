import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoSorting {
  
  public static void main(String[] args) {
    int[] arr = new int[] {4, -10, 9, -20, 100};
    Arrays.sort(arr); // n * longn, merge sort
    System.out.println(Arrays.toString(arr));

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(100);
    arrayList.add(-100);
    arrayList.add(-88);
    arrayList.add(4);

    Collections.sort(arrayList); // nlogn, ascending sort
    System.out.println(arrayList);

    ArrayList<Ball> balls = new ArrayList<>();
    balls.add(new Ball(4, Color.YELLOW));
    balls.add(new Ball(10, Color.RED));
    balls.add(new Ball(9, Color.YELLOW));
    balls.add(new Ball(-10, Color.BLUE));
    balls.add(new Ball(209,Color.BLUE));
    balls.add(new Ball(5, Color.RED));
    Collections.sort(balls);
    System.out.println(balls);
  }
}
