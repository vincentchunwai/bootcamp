import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaDemo {


  public static void main(String[] args) {
    Function<String, Integer> lengthFunction = str -> str.length();
    Function<String, Character> firstChar = str -> str.charAt(0);

    System.out.println(lengthFunction.apply("abcd")); // 4

    LengthFunction lengthFunction2 = new LengthFunction();
    System.out.println(lengthFunction2.apply("def")); // 3

    Map<String, String> map = new HashMap<>();
    map.put("abc", "Mary");
    Function<String, String> formula = s -> "hello";
    String result2 = map.getOrDefault("ssd", "default");
    String result = map.computeIfAbsent("def", formula);
    System.out.println(result);
    System.out.println(result2);
    System.out.println(map.size());

    BiFunction<Integer, Integer, BigDecimal> addition =
        (x, y) -> BigDecimal.valueOf(x + y);
    System.out.println(addition.apply(-4, 3).abs()); //16
    Queue<String> ssr = new LinkedList<>(Arrays.asList("hello", "world", "!"));
    ssr.add("new");
    ssr.poll(); 
    System.out.println(ssr);

    

    map.compute(result, (s1, s2) -> s1 += "added");
    map.compute(result, (s1, s2) -> s2 == null ? s2 + 10 : " world");
    System.out.println(map);


    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);
    

    stock.compute("clothes", (item, oldPrice) -> (int)(oldPrice - oldPrice * 0.09));
    stock.compute("newArrival", (item, oldPrice) -> oldPrice == null ? 120 : (int)(oldPrice - oldPrice * 0.9));
    stock.compute("newArrival", (item, oldPrice) -> oldPrice == null ? 120 : oldPrice - (int)(oldPrice - oldPrice * 0.9));

    System.out.println(stock);
  }
}
