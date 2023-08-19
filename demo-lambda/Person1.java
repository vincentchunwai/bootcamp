import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person1 implements Swimable {
  String name;

  public Person1(String name){
    this.name = name;
  }
  @Override
  public void swim() {
    System.out.println("Person is swimming");
  }
  @Override
  public String toString(){
    return "[ Person :" + this.name + "]";
  }

  public static void main(String[] args) {
    Comparator<Person1> sortByNameDesc =
        (Person1 p1, Person1 p2) -> {
         return p2.name.compareTo(p1.name);
        };
    List<Person1> persons =
        Arrays.asList(new Person1("Alison"), new Person1("john"));
    Collections.sort(persons, sortByNameDesc);
    System.out.println(persons);
    System.out.println();

    Swimable Person1 = () -> System.out.println("I am swimming");
    Person1.swim();

    Swimable Person2 = () -> {
      System.out.println("I am swimming");
      System.out.println("Person 2 stop swimming");
    };
    Person2.swim();

    Swimable Person3 = () -> {
      System.out.println("Person 3 starts to swim");
    };
    Person3.swim();
  }
}
