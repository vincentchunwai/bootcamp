public class person {
  String name;
  int age;
  public person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public void returnInfo(){
    System.out.println("Hello my name is " + this.name);
    System.out.println("My age is " + age + " years old");
  }

  public static void main(String[] args){
    person person = new person("Vincent", 21);
    person.returnInfo();
    person person2 = new person("John", 30);
    person2.returnInfo();

  }
  
}
