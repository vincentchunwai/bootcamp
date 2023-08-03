public class Car {

  // Instance Variables (Instance -> Object)
  // Member Variables
  
  private int numOfWheel; //0

  private int capacity; //0

  private String color; //null

  private String name;

  // Empty Constructor
  public Car(){

  }

  // All-argument constructors (All Parameters)
  public Car(int numOfWheel, int capacity, String color, String name) {
    this.numOfWheel = numOfWheel;
    this.capacity = capacity;
    this.color  = color;
    this.name = name;

  } 
  public void printInfo(){
    System.out.println("Name = " + name + "| Number of Wheels = " + numOfWheel+ "| Capacity = " + capacity + "| Color = "+ color);
  }

  public void SetName(String name){
    this.name = name;
  }

  public String GetName(){
    return this.name;
  }

  public void SetNumOfWheel(int numOfWheel){
    this.numOfWheel = numOfWheel;
  }
  public int GetNumOfWheel(){
    return this.numOfWheel;
  }

  public void SetCapacity(int capacity){
    this.capacity = capacity;
  }

  public int GetCapacity(){
    return this.capacity;
  }

  public void SetColor(String color){
    this.color = color;
  }

  public String GetColor(){
    return this.color;
  }
  
}
