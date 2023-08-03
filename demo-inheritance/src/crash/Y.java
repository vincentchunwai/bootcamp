
public class Y {
  
  private String name;

  public Y(){

  }
  public Y(String name){
    this.name = name;
  }
  public static void staticMethod(){
    System.out.println("I am Y");
  }
  public String getName(){
    return this.name;
  }
}
