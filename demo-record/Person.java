public class Person {
  
  private String name;
  private int age;

  public Person(){

  }

  private Person(String name, int age){
    this.age = age;
    this.name = name;
  }

  public static Person of(String name, int age){
    return new Person(name, age);
  }

  public void SetName(String name){
    this.name = name;
  }

  public void SetAge(int age){
    this.age = age;
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }
}
