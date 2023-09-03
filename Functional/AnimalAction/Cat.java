package AnimalAction;
public class Cat extends Pet{

  public Cat(){

  }
  
  public Cat(String name, int age){
    super(name, age);
  }

  @Override
  public String toString(){
    return "Cat";
  }
}
