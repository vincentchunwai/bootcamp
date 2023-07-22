
public class Computer {
  private int ram;
  private int weight;
  private String color;

  // Constructors
  public Computer(){

  }
  public Computer(int ram, int weight, String color){ // [1] No return type, [2] Constructor name = Class name
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }


  // Methods
  public String getColor(){
    return this.color;
  }
  public void SetRam(int ram){
    this.ram = ram;
  }
  public void SetWeight(int weight){
    this.weight = weight;
  }
  public void SetColor(String color){
    this.color = color;
  }

  public static void main(String[] args){
    Computer computer = new Computer(); // Computer() -> empty constructor
    computer.SetColor("RED");
    computer.SetRam(128);
    computer.SetWeight( 2);

    Computer computer2 = new Computer(16, 2, "Yellow"); // kind of setter
    computer2.getColor(); // -> yellow
    computer.SetColor("Black");
    System.out.println(computer.getColor());
  }
  
}
