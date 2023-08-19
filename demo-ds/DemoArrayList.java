import java.util.ArrayList;
import java.util.Arrays;
public class DemoArrayList {
  
  public static void main(String[] args) {
    // fixed-length
    // for both primitive and class
    int[] arr = new int[] {1, 3, 2};
    Integer[] integers = new Integer[] {1, 3, 2};
    // resize, create new object
    integers = new Integer[] {1, 3, 2, 4};

    // Declaration;
    ArrayList<Integer> numbers;
    // Initialization
    numbers = new ArrayList<>();

    ArrayList<Integer> numbers2 = new ArrayList<>();// empty array 
    numbers2.add(1); // length 1 array
    numbers2.add(3); // length 2 array
    numbers2.add(2); // length 3 array
    numbers2.add(4); // length 4 array
    numbers2.add(null); // length 5 array
    numbers2.add(1, 14);
    numbers2.remove(1);
    // numbers2.add((Integer) Long.valueOf(3)); // Cannot cast Long to Integer
    // variable-length

    Integer[] arr2 = new Integer[numbers2.size()];
    // Define output array type for toArray() perform conversion
    arr2 = numbers2.toArray(arr2);
    System.out.println(Arrays.toString(arr2)); // [1, 3, 2, 4, null]

    // ArrayList<int>, not support primitive

    // Access elements in ArrayList
    for (int i = 0; i < numbers2.size(); i++){
      System.out.print(numbers2.get(i) + "\t");
    }
    System.out.println();

    int original = numbers2.set(2, 100);
    System.out.println(numbers2.get(2));
    System.out.println("original = " + original); // original saves the original value

    //numbers2.clear(); // remove all elements
    System.out.println(numbers2.isEmpty());
    System.out.println(numbers2.size() == 0);

    System.out.println(numbers2.toString());

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    System.out.println(numbers2.addAll(numbers3));
    System.out.println(numbers2.toString());
    System.out.println(numbers2.size());

    numbers2.remove(2);
    System.out.println(numbers2.size()); // 6

    numbers2.removeAll(numbers3);
    System.out.println(numbers2.size());
    System.out.println(numbers2.toString()); //[1, 3, 4, null]
    
    System.out.println(numbers2.indexOf(1000)); //-1
    System.out.println(numbers2.indexOf(3)); // 1

    System.out.println(numbers2.contains(3));
    System.out.println(numbers2.contains(900));
    numbers2.addAll(numbers3);
    System.out.println(numbers2);
    System.out.println(numbers2.contains(numbers3.get(0)));
    System.out.println(numbers2.lastIndexOf(4));

    numbers2.add(1, 4); // insert
    System.out.println(numbers2);

    


    //numbers2.clear(); // remove all element
  }

   
}
