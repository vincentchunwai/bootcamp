import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  
  public static void main(String[] args) {

    // ArrayDeque & LinkedList -> different underlying structure

    Deque<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.addFirst("a");
    arrayDeque.addLast("a");
    arrayDeque.pollFirst();
    arrayDeque.pollLast();
    Deque<String> linkedList = new LinkedList<>();
    linkedList.addFirst("a");
    linkedList.addLast("a");
    linkedList.pollFirst();
    linkedList.pollLast();
    

    Queue<String> arrayQueue = new ArrayDeque<>();
    arrayDeque.add("a");
    arrayDeque.poll();
    
    Queue<String> linkekQueue = new LinkedList<>();
    linkedList.add("a");
    linkedList.poll();

    Queue<String> pQueue = new PriorityQueue<>();
    pQueue.add("a");
    pQueue.poll();

    List<Integer> arraylist = new ArrayList<>();
    List<Integer> linkedlist = new LinkedList<>();

    linkedlist.add(3);
    linkedlist.remove((Object)3);
    
    System.out.println(linkedlist);

    arraylist.add(3);
    arraylist.remove((Object)3);
    System.out.println(arraylist);

    Stack<String> stack = new Stack<>();

    Vector<String> stack2 = new Stack<>();

    Stack<String> stack3 = new Stack<>();
    stack3.pop();
    stack3.push("abc");
    Class<?> cc = stack3.getClass();
    Constructor<?> stack4 = cc.getDeclaredConstructors();
    

  }
}
