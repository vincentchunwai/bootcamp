package Shape;

public class pound {

  private static final double poundPerKg = 0.453592;
  private static final double poundPerOunce = 16.0;
  private static final double poundPerGrams = 453.59237;

  private double pound;

  public pound (double pound){
    this.pound = pound;
  }

  public double getPound(){
    return this.pound;
  }

  public void setPound(double pound){
    this.pound = pound;
  }

  public double getKilograms(){
    return pound * poundPerKg;
  }

  public double getOunces(){
    return pound * poundPerOunce;
  }

  public double getGrams(){
    return pound * poundPerGrams;
  }

  
}
