import java.util.Arrays;
import java.util.Random;
/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique
  public static int[] sumToZero(int n) {
    Random random = new Random();
    int sum = 0;
    int[] array = new int[n];
    /* for (int i = 0; i < n-1; i++) {
      array[i] = random.nextInt(-10, 10);
      sum += array[i];
    }
    for (int i = 0; i < n; i++){
      if (sum > 0){
        array[n-1] = 0 - sum ;
      } else if (sum < 0){
        array[n-1] = 0 + Math.abs(sum) ;
      }
    } */
    for (int i = 1; i < n; i++) {
      array[i] = random.nextInt(-n, n-1);
      sum += array[i];
    }
    if (sum > 0){
      array[0] -= Math.abs(sum);
    }
    if (sum < 0){
      array[0] += Math.abs(sum);
    }
      
    System.out.println(Arrays.toString(array));
    return array;
  }

}
