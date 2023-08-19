import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class DemoOptional {
  public static void main(String[] args) throws Exception{
    List<Bookkk> books = new ArrayList<>();
    books.add(new Bookkk("john"));
    books.add(new Bookkk("Mary"));
    books.add(new Bookkk("Peter"));
    


    Optional<Bookkk> book = books.stream()
    .filter(b -> b.author.startsWith("T"))
    .findAny();

    book.ifPresent(System.out::println);
    System.out.println(book);

    /* if (book.isPresent()){
      System.out.println(book.get());
    }
    else{
      System.out.println("No Book found");
    } */

    Optional<Bookkk> book2 = Optional.ofNullable(new Bookkk("Eric"));
    Optional<Bookkk> book4 = Optional.ofNullable(null);
    Optional<Bookkk> book6 = Optional.empty();

    System.out.println(book6.isPresent());
    Bookkk newBook = book6.orElse(new Bookkk("Default")); 


    Bookkk newBook1 = book6.orElse(new Bookkk("default"));
    Bookkk newBook2 = book6.orElseGet(() -> new Bookkk("default"));
    Bookkk newBook3 = book6.orElseThrow(() -> new Exception());
    int[] numb = {2, 3, 3, 4, 2, 9};
    OptionalInt ans = IntStream.of(numb).min();

  }
}
