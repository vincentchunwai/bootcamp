package comparator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class shape {

  abstract double area(); // implicitly public

  //public static <T extends shape> double area(List<T> shapes){
  public static double area(List<? extends shape> shapes){
    BigDecimal total = BigDecimal.ZERO;
    //shapes.add(new Circle()); // compile-time check, type-safety
    for (shape x : shapes){
      total = total.add(BigDecimal.valueOf(x.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    shape shape = new Circle(); // polymorphism
    shape shape2 = new Square(); // polymorphism
    ArrayList<shape> shapes = new ArrayList<>();
    // shapes = new ArrayList<Circle>(); // compile error

    List<? extends shape> List = new ArrayList<Circle>();
    List = new ArrayList<Square>(); // OK
    //List.add(new Circle()); // compile check refer to declaration

    List<Map<String, String>> list2 = new ArrayList<>();

    
  }
}
