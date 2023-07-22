import java.util.Arrays;

public class search {
  public static void main(String[] args) {
    char target = 'm';
    char[] chars = new char[] {'j', 'p', 'm', 'm', 'q', 'c'};

    int targetNumber = 0;

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        targetNumber++;
        System.out.println("target number = " + targetNumber);
        System.out.println("target index = " + i);
      }
    }

    // toCharArray()
    String str = "I am a boy.";
    char[] arr = str.toCharArray();

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }

    // Find Max. value in the array

    int[] random = new int[] {240, 800, -23, 6, 98, 102, 999, 9901};
    int max = 0;
    int len = random.length - 1;

    for (int i = 0; i < random.length; i++) {
      if (random[len] > random[i]) {
        max = len;

      } else {
        len--;
      } ;

    }
    System.out.println("max = " + max);


    int[] minium = new int[] {240, 800, -23, -79, 102, 999};

    int min = 9999999;
    for (int i = 0; i < minium.length; i++){
      if (minium[i] < min){
        min = minium[i];
      }

    }
    Arrays.sort(minium);
    System.out.println("min = " + min);
    System.out.println(Arrays.toString(minium));


  }
}
