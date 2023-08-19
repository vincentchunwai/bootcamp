import java.util.Random;
import java.util.Objects;

public class Ball {
  private int id;
  private Color color;
  private static int idCounter = 0;

  public Ball(Color color){
    this.id = ++idCounter;
    this.color = color;
  }

  public int getScore(){
    return this.color.getScore();
  }

  public Ball getBall(){
    return this;
  }

  public int getId(){
    return this.id;
  }

  public static Ball random(){
    int random = new Random().nextInt(3);
    Color color = Color.getColor(random);
    return new Ball(color);
  }

  @Override
  public boolean equals(Object object){
    if (this == object)
    return true;
    if (!(object instanceof Ball))
    return false;
    Ball b = (Ball) object;
    return (Objects.equals(b.id, this.id) && Objects.equals(b.color, this.color));
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id, this.color);
  }

  @Override
  public String toString(){
    return "[" + "id = " + this.id + "color = " + this.color.name() + "]";
  }

}
