import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DemoArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<String> strings = new ArrayDeque<>();
    LinkedList<String> strings2 = new LinkedList<>();
    ArrayList<String> strings3 = new ArrayList<>();
    HashMap<String, Integer> grades = new HashMap<>();
    grades.put("Alice", 95);
    grades.put("Bob", 88);
    grades.put("Eve", 92);

  

    // Iterating over entries using forEach
    grades.forEach((name, score) -> {
      System.out.println(name + ": " + score);
    });
    System.out.println();
    strings2.add("ABC");
    strings2.add("BCD");
    strings2.add("DEC");
    // strings2.removeLast();
    strings.add("abc");
    strings.add("def");
    strings.add("abc");
    System.out.println(strings.poll());
    System.out.println(strings.size());
    strings.addLast("xyz"); // addLast() == add()
    System.out.println(strings.poll()); // def
    strings.addFirst("ijk");
    System.out.println(strings.peek());
    strings2.set(0, "hello");
    System.out.println(strings2);

    List<String> list = new LinkedList<>();

    Deque<String> deque = new LinkedList<>(); // Polymorphism  **Readability 
    Queue<String> queue = new LinkedList<>(); // Polymorphism

    queue.add("abc");
    queue.add("ABC");
    deque.addFirst("def");
    deque.addLast("ijk");
    Character c = 'a';
    char a = 'A';
    c.isUpperCase('A');
    
    run(new LinkedList<>()); // linkedlist
    run(new ArrayDeque<>()); // array
    //run(new PriorityQueue<>()) // compile error

    run1(new LinkedList<>());
    run1(new ArrayDeque<>());
    run1(new PriorityQueue<>());

    
  }
  public static void run(Deque<String> deque){
      deque.addFirst("ss");
      deque.addLast("ss");
    }
  public static void run1(Queue<String> queue){
      queue.add("ss");
      queue.add("ss");
    }
}
