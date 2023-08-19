import java.util.HashMap;

public class WordFrequencyExample {
    public static void main(String[] args) {
        String text = "The quick the brown fox jumps over the lazy dog";
        String[] words = text.split(" ");
        
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print word frequency
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}

