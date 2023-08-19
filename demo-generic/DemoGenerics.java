import java.util.ArrayList;

public class DemoGenerics {
  
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();

    //Animal Example

    Dog dog = Dog.of("xyz");
    Zoo<Dog> zoo1 = Zoo.of(dog);
    // zoo1.setAnimal(new Cat()); Compile error, strong type check

    Zoo<Animal> zoo2 = Zoo.of(new Cat());
    zoo2.setAnimal(new Animal());
    zoo2.setAnimal(Dog.of("abc"));
    zoo2.setAnimal(new Cat());

    Zoo<Animal> zoo3 = Zoo.of(new Animal());

  }
}
