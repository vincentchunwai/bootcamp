import java.util.Scanner;

public class evenNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum = scanner.nextInt();
        System.out.println("Your first number: " + firstNum);
        System.out.println("Enter your second number");
        int secondNum = scanner.nextInt();
        System.out.println("Your second number: " + secondNum);

        int result = 0;
        for (int i = firstNum; i <= secondNum; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }

        System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum + ": " + result);

        scanner.close();
    }
}



  

