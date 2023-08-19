package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class AnimalMap<T> {
  Map<T, String> map;

  public AnimalMap(){
    map = new HashMap<>();
  }

  public void put (T type, String animal){
    map.put(type, animal);
  }

  public Set<T> getKey(){
    return map.keySet();
  }
 
  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("!", "Cat");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "Dog");
    map2.put(2, "Dog");
    map2.put(3, "Dog");
    map2.put(4, "Dog");
    map2.put(5, "Dog");

    System.out.println(map2.getKey());
   }
}
