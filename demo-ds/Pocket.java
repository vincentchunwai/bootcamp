import java.util.ArrayList;

public class Pocket {
  
  ArrayList<Ball> balls;

  public Pocket(){
    this.balls = new ArrayList<>();
  }

  public int TotalScore(){
    int sum = 0;
      for (Ball b : this.balls){
        sum += b.getScore();
      }
    return sum;
  }


  public boolean isFull(){
    return balls.size() >= 5;
  }

  public void add(Ball ball){
    
    // if numbers of ball > 5, remove the 1st (idx = 0), and add
    // run-time error if this.balls = null;
    /* if (this.balls.size() > 5){
      this.balls.remove(0);
      this.balls.add(ball);
      return; // early return
    } */
    this.balls.add(ball);
  }

  public void removeFirstBall(){
    this.balls.remove(0);
  }

  public void remove(Ball ball){
    this.balls.remove(ball); // first occurence
  }

  public void remove(int ballId){
    for (Ball b : balls){
      if (b.getId() == ballId){
        this.balls.remove(b);
        return; // remove the first one and return
      }
    }
  }

  public int getSize(){
    return balls.size();
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for (Ball b : balls){
      sb.append(b.toString());
      sb.append(", ");
    }
    return sb.toString();
  }
}
