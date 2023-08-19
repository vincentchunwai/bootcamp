public class Ball {

  private Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override

  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());
    System.out.println(ball.getColor().getColorCode());
    System.out.println(ball.getColor().name());

    Object object = new Ball(Color.RED);
    // Compile-time Class "Object" type check
    object.hashCode(); // reference presentation
    // Compile-time check if Object class has hashCode() method
    // Compile-time check if Ball class inherit Object

    // Run-time object variable stores an address, point a Ball object in heap
    // Run-time determine if Class Ball has hashCode() method.
    // if no, then invoke Class Object hashCode()
    // if yea. invoke the Class Ball hashCode()

    Color color = (((Ball) object).getColor());
   /*  System.out.println(Ball).getColor(); // Compile-time */
    // run-time
    Class<?> clas  = color.getClass();
   System.out.println(clas.getName()); 


   if (Color.BLUE instanceof Color){
    System.out.println("Color.BLUE is an instance of Color");
   }

   if (Color.BLUE.getClass() == Color.class){
    System.out.println("Color.BLUE is instance of Color");
   }

   Object o = 1 - 'a'; // int -> Integer
   System.out.println(o.getClass().getName()); // java.lang.Integer
   Object o2 = 'b';
   System.out.println(o2.getClass().getName()); // java.lang.Character
   Object o3 = new Ball(Color.GREEN);
   System.out.println(o3.getClass().getName());

   
   System.out.println(clas.getClass().isEnum());
   

   System.out.println(clas.isEnum());

   
}
}

