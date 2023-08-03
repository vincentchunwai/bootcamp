/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int carYear;

  // Constructor with variables carYear and carModel
  private String carModel;

  // methods
  public JavaQuest19(int carYear, String carModel){
    this.carYear = carYear;
    this.carModel = carModel;
  }
  public void printInfo(){
    System.out.println("Car Year = " + this.carYear + "," + " Car Model = " + carModel);
  }

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    myCar.printInfo();
  }
}