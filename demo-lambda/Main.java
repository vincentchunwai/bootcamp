import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 10);
        scores.put("Bob", 20);
       // Merge value with a new key
       scores.merge("Charlie", 30, (existingValue, newValue) -> existingValue + newValue);

        scores.computeIfAbsent("Charlie", key -> 30);

        // "Alice" already exists, so no changes are made
        scores.computeIfAbsent("Alice", key -> 50);

        // Using compute to update a value
        scores.compute("Alice", (key, oldValue) -> oldValue += 9);
        scores.computeIfPresent("Alice", (key, oldValue) -> oldValue += 9);

        // Using compute to add a new value
        scores.compute("Charlie", (key, oldValue) -> oldValue == null ? 15 : oldValue + 15);

        System.out.println(scores); // Output: {Alice=15, Bob=20, Charlie=15}
    }
}

