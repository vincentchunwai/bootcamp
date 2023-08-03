import java.util.Arrays;
import java.util.Comparator;

public class ReconstructSentence {
    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";

        System.out.println(reconstructSentence(s1)); // Output: "This is a sentence"
        System.out.println(reconstructSentence(s2)); // Output: "Me Myself and I"
    }

    public static String reconstructSentence(String s) {
        String[] words = s.split(" ");

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num1 = Integer.parseInt(s1.replaceAll("[^0-9]", ""));
                int num2 = Integer.parseInt(s2.replaceAll("[^0-9]", ""));
                return Integer.compare(num1, num2);
            }
        });

        return String.join(" ", words);
    }
}


