import java.util.Comparator;

public class Ball implements Comparable<Ball> {
  int id;
  Color color;

  public Ball(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  // Yellow come first, if color same, id ascending order
  // if not Yellow, id descending order
  @Override
  public int compareTo(Ball ball) {
    if (this.color == Color.YELLOW && ball.color != Color.YELLOW) {
      return -1; // Yellow comes first
    } else if (this.color != Color.YELLOW && ball.color == Color.YELLOW) {
      return 1; // Yellow comes first
    } else if (this.color == Color.YELLOW && ball.color == Color.YELLOW) {
      return Integer.compare(this.id, ball.id); // For Yellow, ascending order of id
    } else {
      return Integer.compare(ball.id, this.id); // For non-Yellow, descending order of id
    }
  }


  @Override
  public String toString() {
    return "[" + "Ball : " + this.id + "\\ Color : " + this.color + "]";
  }
}
