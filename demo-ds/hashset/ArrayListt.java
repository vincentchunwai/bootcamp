package hashset;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListt {
  public static void main(String[] args) {
    Integer[] num = {1, 3, 42, 25, 20};
    BigDecimal dd = BigDecimal.valueOf(9.8);
    ArrayList<Double> arr2 = new ArrayList<>();
    arr2.add(2.1);
    arr2.add(2.3);
    arr2.add(9.3);
    arr2.add(2.3);
    Collections.sort(arr2);
    Collections.swap(arr2, 0, 2);
    Collections.reverse(arr2);
    System.out.println(arr2);
    System.out.println();
    //
    //Collections.shuffle(arr2);
    System.out.println(arr2);
    System.out.println();
    //
    Collections.rotate(arr2, 1);
    System.out.println(arr2);
    System.out.println();
    //
    ArrayList<Double> arr = new ArrayList<>(arr2);
    List<Integer> arr3 = new ArrayList<>(Arrays.asList(num));
    List<Integer> arr4 = new ArrayList<>(Arrays.asList(num));
    arr3.add(888);
    System.out.println(Arrays.toString(num));
    System.out.println(arr3);
    System.out.println(arr);
    System.out.println();
    arr3.add(12);
    arr3 = arr3.subList(1, 4);
    List<Integer> arr5 = new ArrayList<>(arr3.subList(2,3));
    System.out.println(arr3);
    System.out.println(arr5);

    
  }
}
