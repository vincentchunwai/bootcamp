import java.util.Arrays;

public class swap2 {
  public static void main(String[] args){
    int[] nums = new int[] {8, 3, -10, 30, 100, -19};
    // Move the max number to the tail
    int max = 0;
    int ii = 0;
    double average = average(nums);
    System.out.println("average = " + average);
    /*int position = 0;
    for (int i = 0; i < nums.length-1; i++){
      if (nums[i] > max){
        max = nums[i];
        position = i;
      }
    }
    int temp = 0;
    temp = nums[nums.length-1];
    nums[nums.length-1] = max;
    nums[position] = temp; */


    /* for (int i = 0; i < nums.length - 1; i++){
      for (int k = nums.length-1; k > i; k--){
        if (nums[i] > nums[k]){
          max = nums[i];
          ii = i;
        }
      }
      
    }
    int temp = nums[nums.length-1];
    nums[nums.length-1] = max;
    nums[ii] = temp;


    

    System.out.println(Arrays.toString(nums)); */

  }
  public static double average(int[] arr){
    //calculate the average of all numbers in arr.
    double total = 0;
    for (int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    double average = total / arr.length;
    return average;
  }
  
}
