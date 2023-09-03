import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoVar {
  private Optional<String> str;
  public static void main(String[] args) {
    var s = "Hello";
    // s = 3; // error, compile-check -> string
    var i = 2;
    var c = 'a';
    // var n = null; // not allowed, compile cannot complete
    // var[] x = new int[3]; Not allowed

    //Loop
    List<String> strings = Arrays.asList("abc", "def");
    for (var str : strings){
      System.out.println(str);
    }
    List<List<String>> temp = new ArrayList<>();
    List<String> des1 = new LinkedList<>(Arrays.asList("a", "B", c));
    temp.add(des1);
    temp.stream().collect(Collectors.toList());

    

    Map<String, Integer> map = new HashMap<>();
    map.put("a", 1);
    map.put("b", 2);
    map.put("c", 3);
    for (var entry : map.entrySet()){
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    
    var result = getString();
    result.add(Arrays.asList("ABC", "CDV"));
    result.add(Arrays.asList("IJK"));
    
  }

  public static List<List<String>> getString(){
    return Arrays.asList(Arrays.asList("abc"));
  }
}
