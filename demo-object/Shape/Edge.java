package Shape;

public class Edge {

  public static int id;
  
  private double length;

  private String color;


  public Edge(double length, String color){
    ++this.id;
    if (id == 4)
    id = 0;
    this.length = length;
    this.color = color;
  }
  public int getId(){
    return this.id;
  }
  
  public void setLength(double length){
    this.length = length;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getColor(){
    return this.color;
  }

}
