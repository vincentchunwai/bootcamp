import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class DemoHashMap2 {
  
  public static void main(String[] args) {
    
    HashMap<Integer, Book> books = new HashMap<>();
    books.put(128, new Book("Book4"));
    books.put(128, new Book("Book3"));
    System.out.println(books.size());//1

    HashMap<Author, Book> bookMap = new HashMap<>();

    Author author1 = new Author("John", 30);
    Author author2 = new Author("John", 29);
    bookMap.put(author1, new Book("Book1"));
    bookMap.put(author2, new Book("Book2"));
    System.out.println(bookMap.size());//1
    System.out.println(bookMap);

    HashMap<Author, ArrayList<Book>> bookMap2 = new HashMap<>();
    ArrayList<Book> booklist1 = new ArrayList<>();
    booklist1.add(new Book("Book1"));
    booklist1.add(new Book("Book2"));
    ArrayList<Book> booklist2 = new ArrayList<>();
    booklist2.add(new Book("Book3"));
    booklist2.add(new Book("Book4"));
    bookMap2.put(author1, booklist1);
    bookMap2.put(author2, booklist2);

    for (Author key: bookMap2.keySet()){
      System.out.println(key.getName());
    }

    for (ArrayList<Book> bookss: bookMap2.values()){
      for (Book book: bookss){
        System.out.println(book);
      }
    }

    for (Map.Entry<Author, ArrayList<Book>> entry: bookMap2.entrySet()){
      for (Book book : entry.getValue()){
        System.out.println(entry.getKey() + " " + book);
      }

    }

    for (Book book : bookMap2.get(new Author("John", 19))){
      System.out.println(book);
    }
    
  }
}
