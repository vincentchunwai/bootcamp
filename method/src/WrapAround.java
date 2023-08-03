import java.util.Arrays;
  public class WrapAround {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int currentIndex = 0;

        // Example: let's try to access the elements from index 2 to index 7 (out of bounds).
       /*  int startIndex = 2;
        int endIndex = 8;

        for (int i = startIndex; i <= endIndex; i++) {
            int wrappedIndex = wrapAroundIndex(i, array.length);
            System.out.print(array[wrappedIndex] + " ");
        } */
        int[] nums = new int[] {0, 1, 2, 3, 4};
        String strNums = String.valueOf(nums);
        System.out.println(strNums);
        int idx = strNums.indexOf("1");
        System.out.println(idx);
        /* int[] nums5 = new int[] {1, 8, 9, 29,2 ,4};
        Arrays.sort(nums5);
        System.out.println(Arrays.toString(nums5));
        String s = "is2 sentence4 This1 a3";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a)); */
    }

    // Method to wrap around an index based on the array length
    private static int wrapAroundIndex(int index, int arrayLength) {
        return (index % arrayLength + arrayLength) % arrayLength;
    }
}


