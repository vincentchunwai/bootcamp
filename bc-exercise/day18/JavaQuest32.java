import java.util.Arrays;
/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 

Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
 */

public class JavaQuest32 {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(shuffle(new int[] { 1, 2, 3, 4, 5, 6 }, 3)));// [1, 4, 2, 5, 3, 6]
    System.out.println(Arrays.toString(shuffle(new int[] { 2, 5, 1, 3, 4, 7 }, 3)));// [2, 3, 5, 4, 1, 7]
    System.out.println(Arrays.toString(shuffle(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 }, 4)));// [1, 4, 2, 3, 3, 2, 4, 1]
    System.out.println(Arrays.toString(shuffle(new int[] { 1, 1, 2, 2 }, 2)));// [1, 2, 1, 2]
    System.out.println(Arrays.toString(shuffle(new int[] { 2, 50, 1, 303, 4, 607, 8, 999 }, 4)));// [2, 4, 50, 607, 1,
                                                                                                 // 8, 303, 999]

  }

  public static int[] shuffle(int[] nums, int n) {
    int[] x = Arrays.copyOfRange(nums, 0, n);
    int[] y = Arrays.copyOfRange(nums,n , nums.length);
    int[] arr = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = x[i];
            if (i % 2 != 0)
            arr[i] = y[i];
        }
    return arr;
  }
}
