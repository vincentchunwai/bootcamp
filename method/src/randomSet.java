import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class randomSet {
    public static void main(String[] args) {
      int[] nums4 = sumToZero(8);
        int[] nums = sumToZero(5); // n = 5
        int[] nums1 = sumToZero(3); // n = 3
        int[] nums2 = sumToZero(2); // n = 2
        int[] nums3 = sumToZero(1); // n = 1
    }

    public static int[] sumToZero(int n) {
        Random random = new Random();
        int sum = 0;
        int[] array = new int[n];
        Set<Integer> set = new HashSet<>();

        // Generate (n-1) unique random integers
        for (int i = 0; i < n - 1; i++) {
            int num;
            do {
                num = random.nextInt(-n, n-1); // Generate random number between -n to n-1
            } while (set.contains(num)); // Ensure uniqueness
            set.add(num);
            array[i] = num;
            sum += num;
        }

        // Calculate the last number to ensure the sum is zero
        array[n - 1] = -sum;

        System.out.println(Arrays.toString(array));
        return array;
    }
}

