import java.util.Random;

public enum Color {
  RED(100), //
  BLUE(200), //
  YELLOW(300), //
  ;

  
  private int score;
  

  private Color(int score){
    this.score = score;
  }

 

  /* public static Color getColor(int id){
    for (Color c : Color.values()){
      if (id == c.id)
      return c;
    }
    return Color.BLUE;
  } */

  public static Color getColor(int id){
    if (id < 0 || id > 2)
    return null;
    switch(id){
      case 0:
      return Color.RED;
      case 1:
      return Color.BLUE;
      case 2:
      return Color.YELLOW;
    }
    return null;
  }

  public int getScore(){
    return this.score;
  }
}
