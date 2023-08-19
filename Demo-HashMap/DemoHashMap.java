import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class DemoHashMap {
  public static void main(String[] args) {
    //Background: String[int], Array must use int as index
    //limitation: you can only access the element by index

    HashMap<String, String> map = new HashMap<>();
    //<String, String> -> <key, value>
    map.put("abc", "hello world");
    map.put("bcd", "I am Developer");
    System.out.println(map.size());
    map.put("abc", "hello world !!!"); // Override the entry with key "abc"
    map.put("efg", "hello world"); 
    map.put("hij", "hello world");
    HashSet<String> arrr = new HashSet<>();

    System.out.println(map.get("abc")); // "hello world !!!"
    System.out.println(map.size());

    System.out.println(map.isEmpty()); // false
    System.out.println(map.toString());
    System.out.println();
    map.remove("abc");
    System.out.println(map.toString());

    System.out.println(map.remove("bcd", "I am not developer"));

    //Map.Entry -> Key + Value
    // If Duplicated (), override the entry
    // if duplicated (equals(), hashCode(), override)


    /* HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(1, "hello world");
    map2.put(2, "I am Developer");
    System.out.println(map.size());
 */
    System.out.println("map contains abc = "+ map.containsKey("Contains key abc"));
    System.out.println("map contains hello world = " +map.containsValue("hello world"));

    for (Map.Entry<String, String> entry : map.entrySet()){
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

    String[] test = new String[map.size()];

    int i = 0;
    for (String key : map.keySet()){
      test[i++] = key;
    }
    System.out.println(Arrays.toString(test));
    System.out.println(map.size());
    String[] str = {"hello", "world", "hi", "I", "am", "ABC", "EDF", "hello", "HELLO"};
    HashMap<String, Integer> count = new HashMap<>();

    for (String word: str){
      word = word.toLowerCase();
      word = word.replaceAll("[^a-zA-z]", "");
      count.put(word, count.getOrDefault(word, 0)+1);
    }

    for (String word: count.keySet()){
      System.out.println(word + ":" + count.get(word));
    }

    /* for (String key : map.keySet()){
      
    }

    for (String value : map.values()){
      System.out.println(value);
    }

    ///
    System.out.print(map.keySet());
    System.out.println(map.values());
    System.out.println();
     */

    


  }
}
