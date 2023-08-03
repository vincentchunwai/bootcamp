public class Student extends Person implements Runnable, Swimable, Move {

  private String name;

  private int score;

  @Override
  public void jump() {

  }



  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swimming");
  }

  @Override
  public void breath() {
    System.out.println("Student is breathing");
  }

  public static void main(String[] args) {
    // MAX_SPEED
    System.out.println(Move.MAX_SPEED);

    Move student = new Student();

    // System.out.println(move.MAX_SPEED); // Not recommended

    Move dog = new Dog();


    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student();
    person.breath();
    person.getAge();


  }
}

