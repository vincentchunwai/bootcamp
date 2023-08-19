package hashset;

import java.util.Objects;

public class Coordinate {
  int x;
  int y;

  public Coordinate(int x, int y){
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if(!(o instanceof Coordinate))
    return false;
    Coordinate c = (Coordinate) o;
    return this.x == c.x && this.y == c.y;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.x, this.y);
  }
}
