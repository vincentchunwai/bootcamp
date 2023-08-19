public class Engine {
  int rpm;

  private Engine(int rpm){
    this.rpm = rpm;
  }

  public static Engine of(int rpm){
    return new Engine(rpm);
  }

  @Override
  public String toString(){
    return "[ engine rpm : " + this.rpm + "]";
  }
}
