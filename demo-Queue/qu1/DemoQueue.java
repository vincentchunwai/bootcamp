import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class DemoQueue {
  public static void main(String[] args) {
    LinkedList<String> queue = new LinkedList<>();
    // First In first Out
    queue.add("hello");
    queue.add("world");
    System.out.println(queue.peek()); // hello
    System.out.println(queue.poll()); // hello
    System.out.println(queue.poll()); // world
    queue.offerFirst("First");
    //
    String temp = queue.poll();
    System.out.println(temp);
    System.out.println(queue.size());
    queue.add("abc");
    queue.add("ABC");
    queue.add("abc");
    queue.remove("abc"); // remove first occurence
    System.out.println(queue);

    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.offer("ijk")); // add()
    System.out.println(queue.size());

    queue.offerFirst("First");
    System.out.println(queue);
    queue.offerLast("Last");
    System.out.println(queue);

    for (String q : queue) {
      System.out.println(q);
    }

    PriorityQueue<String> backup = new PriorityQueue<>(queue);
    /* while (!queue.isEmpty()) {
      System.out.print(queue.poll());
      System.out.print(" ");
    } */

    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0); // 2nd even number
    queueNum.add(-3);
    queueNum.add(100);
    int i = 0;
    int size = queueNum.size();
    int element = 0;
    int countEven = 0;
    queueNum.poll();
    System.out.println(queueNum);
    System.out.println();



    while (i++ < (size)){
      System.out.println(size);
      element = queueNum.poll();
      if (element % 2 == 0){
        if (++countEven == 2){
          continue;
        }
      }
      queueNum.add(element);
    }
    System.out.println(queueNum);
    
  }
  
}
