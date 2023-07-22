import java.util.Arrays;
public class Array {
  public static void main(String[] args) {
    int num = 7;
    int num2 = 9;
    int num3 = -30;

    // Array

    int[] nums = new int[3]; // 3 is the length of array nums
    // with index 0, 1, 2
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    // nums[3] ArrayIndexOutOfBound exception

    double[] doubleNum = new double[3];
    Arrays.sort(nums);
    
    for (int i = 0; i < nums.length; i++){
      System.out.println("nums[" + i + "]= " + nums[i]);
    }

    for (int i = nums.length - 1; i >= 0; i--){
      System.out.println("nums[" + i + "]= " + nums[i]);
    }

    int[] array = new int[] {0, 1, 2, 3, 4, 5, 6};
    
    for(int i = 0; i < array.length; i++){
      System.out.println("array[" + i + "]= " +array[i]);
    }

    // Can we add a new element at tail? No
    // Modify an element

    array[2] = -10;
    Arrays.sort(array);
    
    for(int i = 0; i < array.length; i++){
      System.out.println("array[" + i + "]= " +array[i]);
    }

    // char[]
    char[] chars = new char[3];
    chars[2] = 'a';
    chars[0] = '!';
    for (int i = 0; i < chars.length; i++){
     System.out.println("chars[" + i + "]= " + chars[i]);
    }

    long[] longs = new long[4];
    longs[0] = 123;
    for (int i = 0; i < longs.length; i++){
     System.out.println("longs[" + i + "]= " + longs[i]);
    }

    //String

    String[] strs = new String[] {"hello", "abc", "goodbye"};
    strs[1] = "typhoon";
     for (int i = 0; i < strs.length; i++){
     System.out.println("strs[" + i + "]= " + strs[i]);
    }

    String[] fruits = new String[5];
    fruits[0] = "apple";
    fruits[1] = "watermelon";
    fruits[2] = "orange";

    System.out.println(Arrays.toString(fruits));

    


  }
}
