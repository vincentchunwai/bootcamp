package ds;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collections;

public class DemoPQ {
  
  public static void main(String[] args) {
    // Priority: natural order by default
    Queue<String> queue = new PriorityQueue<>(new SortByDescending());
    queue.add("bcd");
    queue.add("abc");
    queue.add("clp");
    queue.add("bio");
    queue.add("def");

    System.out.println(queue); // abc
    System.out.println();
  }
}
