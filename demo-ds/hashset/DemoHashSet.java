package hashset;

import java.util.HashSet;
import Book;
public class DemoHashSet {
  public static void main(String[] args) {
    // HashSet is good at handling duplicates
    // Example 1:
    HashSet<String> strings = new HashSet<>();

    System.out.println(strings.add("abc"));
    strings.add("def");
    System.out.println(strings.size());
    // HashSet
    boolean result = strings.add("abc");
    System.out.println(strings.size());
    System.out.println(result);

    if (strings.add("def")){
      System.out.println("def is added");
    } else {
      System.out.println("is not added");
    }
    System.out.println(strings.add("kdf"));
    System.out.println();


    // Example 2: With Override equal method
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    System.out.println(coordinates.add(c1));
    System.out.println(coordinates.add(c2));
    System.out.println(coordinates.size()); // duplicates
    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3));
    System.out.println(coordinates.size());

    System.out.println();

    HashSet<Integer> ints = new HashSet<>();
    ints.add(8);
    ints.add(8);
    System.out.println(ints.size());
    String ii = "Hello";

    // Example 3: Without Override equal() method
    HashSet<Book> books = new HashSet<>();
    System.out.println(books.add(new Book("Eric")));// true
    System.out.println(books.add(new Book("Eric")));// true, different address
    System.out.println(books.add(new Book("Steven")));// true, different address
    
  }
}
