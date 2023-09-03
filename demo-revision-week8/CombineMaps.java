import java.util.HashMap;
import java.util.Map;

public class CombineMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 5);
        map1.put("banana", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 2);
        map2.put("cherry", 4);

        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));

        System.out.println(map1);
    }
}

