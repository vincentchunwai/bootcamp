package abstracts;
public abstract class Person {
  
  private int age;

  private double weight;

  private double height;

  public Person(){

  }
  public Person(int age, double height){
    this.age = age;
    this.height = height;
  }

  public int getAge(){
    return this.age;
  }
  public double getHeight(){
    return this.height;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setHeight(double height){
    this.height = height;
  }

  // May contain instance method with implementation

  public void run(){
    System.out.println("I am Person. running");
  }
  // May contain abstract method (without implementation)
  public abstract void sleep();
}
