package Shape;

public class Circle {

  private int id; // instance variable / attribute
  private double radius;

  // static -> shared variable
  // final -> one time initialization ONLY
  private static final double pi = 3.14159; //static variable

  private static int counter; // calculate the number of circle objects being created

  /* public Circle(double radius){
    this.radius = radius;
  } */

 public Circle(){
  /* this.id++; */
  AddCounter();
  this.id = getCounter();
 }

 public int getId(){
  return this.id;
 }

 public void AddCounter(){
  this.id++;
  counter++;
 }
 public static int getCounter(){
  return counter;
 }
  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double area(){
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference(){ //instance method
    return 2 * radius * pi;
  }
  public static void main(String[] args) {
    Circle c = new Circle(); // Constructor
    //circle.radius = 1;
    c.setRadius(2);
    c.area();
    c.circumference();
    Circle c2 = new Circle(); // Constructor
    //circle.radius = 1;
    c2.setRadius(4);
    c2.area();
    c2.circumference();
    System.out.println(c.getId());
    System.out.println(c2.getId());
  }
  
}
