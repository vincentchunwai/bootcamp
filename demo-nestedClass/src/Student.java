// Outer Class
// Can Access static nested class attribute

import java.util.List;

public class Student {
  private String name;
  private Bag bag;
  private int size;

  private Student(String name, int size) {
    this.bag = new Student.Bag();
  }

  public Student of(String name, int size) {
    return new Student(name, size);
  }

  public int getBagSize() {
    return this.bag.size;
  }
  public String getName(){
    return this.name;
  }

  public void clearBag() {
    Bag.clear(this.bag); // Outer Class access "Static nested class" static method

  }

  public static int add(int a, int b) {
    return a + b;
  }

  @Override
  public String toString(){
    return "Student [name" + this.name 
    +this.bag+"]"
    ;
  }

  // inner class cannot access outer class static method
  public class Grade {
    int score;
    Student student;

    public char getGrade() {
      switch (this.score) {
        case (80):
          return 'A';
        case (70):
          return 'B';
        case (60):
          return 'C';
        case (50):
          return 'D';
        default:
          return 'F';
      }
      
    }
    public Student getStudent() {
      return Student.this;
    }

    public void printName(){
      System.out.println(name);
    }
   

    public void printStudentName(){
      System.out.println(Student.this.getName());
    }

    public Grade(int score) {
      this.score = score;
    }
  }

  // static nested class
  // Cannot Access Outer Class Attribute
  public static class Bag {
    int size;
    List<String> strings;

    // constructor
    // getter, setter
    // instance method
    public int getSize() {
      return this.size;
    }

    // static method & variable
    public static void clear(Bag bag) {
      bag.strings.clear();
    }

    @Override
    public String toString(){
      return "Bag [ size = " + this.size + "strings = " + this.strings + "]";
    }
  }

  public static void main(String[] args) {
    Student student = new Student("john", 19);

    //System.out.println(student.bag.getSize());
    Student.Bag bag = new Student.Bag();

    Student.Grade grade = new Student("sam", 20).new Grade(70);
    Student.Grade grade2 = student.new Grade(70);

    System.out.println(grade2.getStudent().getName());
    grade2.printName();


  }
}
