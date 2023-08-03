package Objects;

import java.util.Objects;

public class Ball { // implicitly call Object method

  private String color;

  public Ball(String color){
    this.color = color;
  }
  @Override
  public int hashCode(){
    // Hash Code is not unique representation of object reference
    return Objects.hash(color);
  }
  @Override
  public String toString(){
    return "[color = " + this.color + "]";
  }

  @Override
  public boolean equals(Object o){ // instance method
    // if address same, value inside the object must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o ; // downcast
    
    return ball.color.equals(this.color); // check color
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("Blue");
    Ball b2 = new Ball("Blue");
    System.out.println(b2.hashCode());
    System.out.println(b2.equals(b1));
    System.out.println(b1);
    System.out.println(b2);
    

  }
  
}
