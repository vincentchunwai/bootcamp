import java.util.Objects;

public class Superman implements Flyable{
  @Override
  public void fly(){
    System.out.println("I can fly");
  }

  public static void main(String[] args) {
    // 3 ways to new a flyable object
    // 1 Polymorphism
    Flyable superman = new Superman();
    // 2 Anonymous
    Superman superman2 = new Superman();
    // 3 
    boolean isNull = Objects.isNull(superman2);
    Flyable superman3 = new Flyable() {
      @Override
      public void fly(){
        System.out.println("I am Flying");
      }
    };
    Flyable superman4 = () ->System.out.println("I can Fly");


    
  }
}
