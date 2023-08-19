package AircraftBuilder;

public class FuelTank {
  private double capacity;
  private double currentFuel;
  private boolean isFull;
  private boolean isEmpty;

  public FuelTank(double capacity) {
    this.capacity = capacity;
    this.currentFuel = 0;
    this.isFull = false;
    this.isEmpty = true;
  }

  public void addFuel(double amount) {
    if (this.currentFuel + amount > capacity) {
      System.out.println("fuel amount exceeds fuel tank capacity");
      this.currentFuel = capacity;
      this.isFull = true;
      this.isEmpty = false;
    } else if (this.currentFuel + amount == capacity) {
      this.isFull = true;
      this.currentFuel = capacity;
      this.isEmpty = false;
    } else
      this.currentFuel += amount;
    this.isEmpty = false;
  }

  public double getCurrentFuel() {
    return this.currentFuel;
  }

  public boolean checkIsFull() {
    return this.isFull;
  }

  public boolean checkIsEmpty() {
    return this.isEmpty;
  }

  public double getCapacity(){
    return this.capacity;
  }

  public void drainTank(){
    this.currentFuel = 0;
    this.isEmpty = true;
    this.isFull = false;
  }



}
