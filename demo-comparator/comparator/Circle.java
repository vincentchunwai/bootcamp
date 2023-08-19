package comparator;

public class Circle extends shape{
  int radius;

  @Override
  public double area(){
    return Math.pow(radius, 2) * Math.PI;
  }
}
