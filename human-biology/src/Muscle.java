public class Muscle {
  private String name;
  private String function;
  private double strength;

  public Muscle(String name, String function, double strenght){
    this.name = name;
    this.function = function;
    this.strength = strenght;
  }

  public String getName(){
    return this.name;
  }

  public String getFunction(){
    return this.function;
  }

  public double getStrength(){
    return this.strength;
  }

  public void contract(){
    System.out.println(this.name + "is contracting");
  }

  public void relax(){
    System.out.println(this.name + "is relaxing");
  }
}
