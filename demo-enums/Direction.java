public enum Direction { // special keyword since Java 1.5
  // 1.public class Direction extends enum
  // 2.enum is final class

  // 全局唯一 // enum cannot new // 4 objects (EAST, SOUTH, WEST, NORTH)
  // JVM automaticly new Direction ("EAST", "SOUTH", "WEST", "NORTH")
  EAST('E', 90), //
  SOUTH('S', 180), //
  WEST('W', 270), //
  NORTH('N', 360);

  private char direction;
  private int degree;


  private Direction(char direction, int degree){ // must be private
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection(){
    return this.direction;
  }
  
  public int getDegree(){
    return this.degree;
  }

  /* public void setDirection(char direction){  // false design
    this.direction = direction;
  } */
}
