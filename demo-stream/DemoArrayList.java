import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class DemoArrayList {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ghi");
    strings.add("ABCde");
    strings.add("EPF");

    // strings.forEach(s -> System.out.println(s));

    Stream<String> StreamStrings = strings.stream();

    StreamStrings = StreamStrings.filter(s -> s.startsWith("a"));

    StreamStrings.forEach(s -> System.out.println(s));

    List<String> strings2 = strings.stream().filter(s -> s.length() == 3)
        .collect(Collectors.toList());

    // Comparator<String> compareA = Comparator.comparing("hello", "world");

    List<Integer> lengths =
        strings.stream().filter(e -> e.startsWith("a") || e.startsWith("A"))
            .map(e -> e.length()).collect(Collectors.toList());
    Comparator<String> comparator =
        (s1, s2) -> Integer.valueOf(s1) < Integer.valueOf(s2) ? -1 : 1;

    lengths.forEach(System.out::println);

    List<String> strings3 = strings2.stream().sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
    System.out.println(strings3.get(0));
    int counter = 0;
    for (Integer i = 0; i < 2; i++){
        counter += (byte) (i + 9);
    }
    System.out.println(counter);

    // strings3.forEach(System.out::println);

    boolean result = strings2.stream().anyMatch(e -> e.startsWith("a"));
    System.out.println(result);

    if (strings2.stream().anyMatch(e -> e.startsWith("a"))) {
      System.out.println("one element starts with a");
    }

    // interminate operations:
    // filter(), map(), sorted(), anyMatch()

    // terminated operations:
    // collect(), forEach()

    // stream can only terminate once,
    // but it may have multiple intermination

    List<Personn> persons =
        Arrays.asList(new Personn("John", 30), new Personn("Mary", 25));
    List<String> names =
        persons.stream().map(p -> p.name).collect(Collectors.toList());
    System.out.println(names);
    List<Personn> persons2 = Arrays.asList(new Personn("John", 30),
        new Personn("Mary", 25), new Personn("Ivy", 20), new Personn("Ivy", 15),
        new Personn("Tom", 15));
    TreeMap<String, Integer> info =
        persons2.stream().collect(Collectors.toMap(person -> person.name,
            person -> person.age, (key, value) -> key, TreeMap::new));
    System.out.println(info);
    // Person[] arr = persons.toArray();


    Long num = Stream.of("abc", "Def", "ADE", "abc")
        .filter(e -> e.length() == 3).distinct().count();
    System.out.println(num);

    List<Personn> persons3 =
        Arrays.asList(new Personn("John", 30), new Personn("Mary", 25));


    List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));

    IntStream intStream = listOfLists.stream()
        .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue));

    intStream.forEach(System.out::println);
   
    int[] array = {1, 2, 3, 4};

    Map<Character, Integer> mmap = new HashMap<>();
    mmap.put('c', 1);
    mmap.put('b', 1);
    mmap.put('d', 1);
    mmap.put('c', 1);
    mmap.remove('c');
    System.out.println(mmap);
    String k = "helloh";
    int first = k.indexOf("h");
    int last = k.lastIndexOf("h");
    System.out.println(first);
    System.out.println(last);

    Queue<Character> chars = new LinkedList<>();
    chars.add('a');
    System.out.println(chars.peek());
    int[] aaa = {1, 3, 5, 7, 9, 3, 3, 3};
    int[] sum = IntStream.of(aaa).distinct().toArray();
    System.out.println(sum);
    
    Stream<Integer> stream = Stream.of(1, 2, 3, 4)
    .filter(e -> e== 2)
    .map(e -> {
        System.out.println(e);
        return e;
    });
    System.out.println(stream.count());

    System.out.println();
     HashSet<Integer> setSize = Stream.of(1, 2, 3, 3)
    .collect(Collectors.toCollection(HashSet::new));
    

    List<String> animals = Arrays.asList("lion", "tiger", "bear");
    Map<String, Integer> animalMap = animals.stream()
    .collect(Collectors.toMap(str -> str, str -> 1));
    animals.forEach(System.out::println);
    int[] num1 = {1, 2, 3, 9, 0};
    int[] num2 = {1, 5, 3, 8, 6, 17, 21, 13};
    int[] num3 = {1, 7, 3, 9, 14};
    Stream<int[]> arrayOfStream = Stream.of(num1, num2, num3);
    List<Integer> modified = arrayOfStream.flatMapToInt(Arrays::stream)
    .distinct().sorted().filter(s -> (s % 2 != 0)).boxed().collect(Collectors.toList());
    System.out.println(modified);



    for (Map.Entry<String, Integer> entry: animalMap.entrySet()){
        System.out.println(entry);
    }

    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> copy1 = List.copyOf(modified);
    List<Integer> copy2 = List.copyOf(modified);

    lists.add(copy1);
    lists.add(copy2);
    List<Integer> finals = lists.stream()
    .flatMap(List::stream)
    .filter(s -> s > 3)
    .sorted(Integer::compareTo)
    .collect(Collectors.toList());
    System.out.println(finals);

    /* boolean check = IntStream.of(num1).skip(0)..anyMatch(s -> (s < 1)); */
  }

  public static boolean find(List<Personn> persons){
    return persons.stream()  //Stream<>
    .filter(e ->e >= 65) // Stream<>
    .findFirst() // Optional<Person>
    .isPresent(); // boolean
    
  }
}
