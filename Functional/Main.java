import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Person> people = List.of(
      new Person("John", Gender.MALE),
      new Person("Maria", Gender.FEMALE),
      new Person("Aisha", Gender.FEMALE),
      new Person("Alice", Gender.FEMALE),
      new Person("Joe", Gender.MALE),
      new Person("Ken", Gender.MALE)
    );

    List<Person> females = new ArrayList<>();

    for (Person person: people){
      if (Gender.FEMALE.equals(person.gender)){
        females.add(person);
      }
    }
    for (Person female: females){
      System.out.println(female);
    }

    people.stream()
    .filter(person -> person.gender.equals(Gender.FEMALE))
    .collect(Collectors.toList())
    .forEach(System.out::println);
  }

   static class Person{
    private final String name;
    private final Gender gender;

   Person(String name, Gender gender){
      this.name = name;
      this.gender = gender;
    }

    @Override
    public String toString(){
      return "Name : " + this.name + " Gender : " + this.gender;
    }
  }

  enum Gender{
    MALE, FEMALE;
  }
}
