package abstracts;
public abstract class Adult extends Person{
  // abstract class extends abstract class
  // implicitly "extends" abstract method

  public Adult(){
    super();
  }
  public Adult(int age, double weight){
    super(age, weight);
  }

  public abstract void read();

  public void eat(){
    System.out.println("I am Adult, eating");
  }
  
}
