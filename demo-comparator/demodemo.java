import java.util.HashMap;
import java.util.Map;
public class demodemo {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.remove(3);

    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        int key = entry.getKey();
        String value = entry.getValue();
        System.out.println("Key: " + key + ", Value: " + value);
    }
}
}
