package Shape;

public class Square {

  public static int edgeCounter = Edge.id;

  private final Edge[] edges ; // set address here or in constructor



  /* public Square(double length) { // empty constructor //encapsulation// first assignment//
    this.edges =  new Edge[4] ;
    this.edges[0] = new Edge(length, "Red");
    this.edges[1] = new Edge(length, "Yellow");
    this.edges[2] = new Edge(length, "Black");
    this.edges[3] = new Edge(length,"Blue"); 
  } */

  public Square(double length) { // empty constructor //encapsulation// first assignment//
    if (length <= 0.0)
      length = 1.0d;
    this.edges =  new Edge[4] ;
    this.edges[0] = new Edge(length, "Red");
    this.edges[1] = new Edge(length, "Red");
    this.edges[2] = new Edge(length, "Red");
    this.edges[3] = new Edge(length,"Red"); 
  }
  
  

  public static Square of(double length){
    return new Square(length);
  }

  public static Square of(int length){
    return new Square(length);
  }

  public static Square of(String length){ 7
    return new Square(Double.valueOf(length));
  }

  public static Square of(float length){
    return new Square(length);
  }


  /* public void setEdges(Edge[] edges){ // can't set instance method due to final
    this.edges = edges;
  } */

  public void modify(double length){
    this.edges[0].setLength(length);
    this.edges[1].setLength(length);
    this.edges[2].setLength(length);
    this.edges[3].setLength(length);
  }
  public void modify(String color){
    this.edges[0].setColor(color);
    this.edges[1].setColor(color);
    this.edges[2].setColor(color);
    this.edges[3].setColor(color);
  }
  /* public Square(Edge[] edges){
    this.edges = edges;
  } */
  private Edge[] getEdges(){
    return this.edges;
  }
  
  public static void main(String[] args) {
    Square square = new Square(10);
    Square square2 = new Square(4);
    Square square3 = new Square(5);
    Square s1 = Square.of(5.0d);
    Square s2 = Square.of(4);

    square.getEdges()[0].setColor("yellow");
    square.getEdges()[1].setColor("black");
    System.out.println(square.getEdges()[1].getColor());

    System.out.println(square.getEdges()[2].getId());
    System.out.println(square2.getEdges()[3].getId());
    System.out.println(square3.getEdges()[0].getId());

    // getEdges() has 4 addresses, getEdges()[0] -> 1 address

  }

}
