import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] nums = new int[] {5, 1, 4, 8, 2};
    int[] nums2 = new int[] {19, 5, 3, 11, 7, 28, 40, 2, 1};
    nums2 = insertionSort(nums2);
    nums = insertionSort(nums);
    System.out.println(Arrays.toString(nums2));
    System.out.println(Arrays.toString(nums));
    // Step 1.1: [1, 5, 4, 8, 2] (insert 1 to arr[0], 1 < 5)
    // Step 2.1: [1, 4, 5, 8, 2] (insert 1 to arr[0], 1 < 5)
    // Step 3.1: [1, 4, 5, 8, 2] (insert 1 to arr[0], 1 < 5)
    // Step 4.1: [1, 2, 4, 5, 8] (insert 1 to arr[0], 1 < 5)
  }

  public static int[] insertionSort(int[] arr){
    int key;
    int j;

    for (int i = 1; i < arr.length; i++){
      key = arr[i];
      for ( j = i - 1 ; j >= 0 && arr[j] > key; j--){
        arr[j+1] = arr[j];
      }
      arr[j+1] = key;
    }
    return arr;

    }
  }


