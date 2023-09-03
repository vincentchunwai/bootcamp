import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class week8recap {
  
  public static void main(String[] args) throws Exception{
    // Stream support List, Map, Arrays.streak
    List<String> Strings =  new LinkedList<>();
    Strings.add("abc");
    Strings.add("defijk");
    Strings.stream()
      .filter(e -> e.startsWith("a"))
      .forEach(System.out::println);
    Strings.stream()
      .map(e -> e.length())
      .filter(l -> l < 5)
      .forEach(System.out::println);
  }

  public static List<Integer> getAges(List<String> list){
    return list.stream()
    .map(String::length)
    .filter(e -> e < 6)
    .collect(Collectors.toList());
  }
}
