package AnimalAction;
public class Dog extends Pet{
  

  public Dog(){

  }
  public Dog(String name, int age){
    super(name, age);
  }

  @Override
  public String toString(){
    return "Dog";
  }
}
