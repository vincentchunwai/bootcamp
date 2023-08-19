public class Dog extends Animal{
 
 
  String owner;
  public Dog(){

  }
  private Dog(String name){
    super(name);
  }
  public Dog(String name, String owner){
    super(name);
    this.owner = owner;
  }
  public Dog(String name, int id){
    super(name, id);
  }

  public static Dog of(String name){
    name = name == null ? "default" : name;
    return new Dog(name);
  }

  public static void main(String[] args) {
    Animal dog = new Animal("abc");
    dog.getName();
    System.out.println(dog.getName());

  }
}
