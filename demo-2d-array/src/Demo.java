import java.util.Arrays;
import java.util.Random;

public class Demo {

    int age;

    public Demo(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        // int[] num; -> declaration
        // new int[3]; -> initialization
        nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // re-assignment
        int[] num2 = { 1, 3, 4, 5, 0 };

        int[][] matrix = new int[3][4]; // new int[row][column];

        // 3 rows x 4 colums
        // 1, 2, 3, 10
        // 4, 5, 6, 7
        // 10, 2, 3, 1

        // random 12 (0-12)
        // matrix[0] -> return int[]
        // matrix[0][2] -> Get the idx 2 from the array of the row 0
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int randomNum = random.nextInt(13);
                matrix[i][j] = randomNum;
            }
        }
        for (int k = 0; k < matrix.length; k++) {
            System.out.println(Arrays.toString(matrix[k]));
        }
        System.out.println(Arrays.deepToString(matrix));

        // convert 2D array to 1D
        int idx = 0;
        int[] arr = new int[matrix.length * matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arr[idx++] = matrix[i][j];
            }
        }

        System.out.println(Arrays.toString(arr));

        // Convert 2D array to a String
        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                str += matrix[i][j];
            }
        }
        System.out.println(str);

        // 3D array
        int[][][] arr3d = new int[1][2][3];
        // 4D array
        int[][][][] arr4d = new int[1][2][3][4];

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo(random.nextInt(63));
        demo[0][1] = new Demo(random.nextInt(63));
        demo[1][0] = new Demo(random.nextInt(63));
        demo[1][1] = new Demo(random.nextInt(63));

        for (int i = 0; i < demo.length; i++) {
            for (int j = 0; j < demo[0].length; j++) {
                System.out.println(demo[i][j].age);
            }
        }

        /*
         * String[][] strings = new String[][] {{"abc", "def"}, {"xyz", "ijk"}};
         * for (int i = 0; i < strings.length; i++){
         * for (int j = 0; j < strings[0].length; j++){
         * System.out.println(strings[i][j]);
         * }
         * }
         */

    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
