import java.util.Objects;

public class Point {

  private int x;
  private int y;
  

  public Point(int x, int y){
    this.x = y;
    this.y = y;
  }

  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.x, this.y);
  }
  @Override
  public String toString(){
    return "[x = " + this.x + ", y = " + this.y + "]";
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Point))
    return false;
    Point point = (Point) o;
    return Objects.equals(point.x, this.x) && Objects.equals(point.y, this.y);
  }

  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(2, 0);
    System.out.println(p1.equals(p2));
    System.out.println(p3.equals(p2));
    System.out.println(p1);
    System.out.println(p2);

    Object obj = new String("abc");
    //Shape shape = new Circle10(5.0d);
    // shape.print(); // no print() method in space
    // Hide child print() method
    System.out.println(obj instanceof String);//true

    obj = Long.valueOf(10);
    System.out.println(obj instanceof String);//false
    System.out.println(obj instanceof Long);//true

    //Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number);//true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true
    Long l = 1L;
    int i = 1;
    Point.print(10L);
    Point.print(Long.valueOf("10"));
    Point.print((long)10);
    if(Long.valueOf("100") < 101){ 
      // convert Long 100 -> long 100
      // 101 -> int
      // long vs int

    }
    if(Boolean.valueOf(false).equals(false)){

    }
    if(Boolean.valueOf(false) == (false)){

    }

    // Bug
    System.out.println(Objects.equals(l, i)); // false 
    //Boolean long method instanceOf overrides

  }

  public static void print(Long l){
    System.out.println("l = " + l);
  }
}
