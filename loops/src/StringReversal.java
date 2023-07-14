import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
     String str = "Hello";
     String reversed = "";
     for (int i = str.length()-1; i >=0; i--){
        System.out.print(reversed.concat(String.valueOf(str.charAt(i))));
     }
}
}

