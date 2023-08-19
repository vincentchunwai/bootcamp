package AircraftBuilder;

public class Turbine {
  private int ThrustToWeightRatio;
  private int FuelConsumption;
  private int BypassRatio;
  private int Emissions;

  public void setThrustToWeightRatio(int ThrustToWeightRatio){
    this.ThrustToWeightRatio = ThrustToWeightRatio;
  }

  public void setFuelConsumption(int FuelConsumption){
    this.FuelConsumption = FuelConsumption;
  }

  public void setBypassRatio(int BypassRatio){
    this.BypassRatio = BypassRatio;
  }

  public void setEmissions(int Emissions){
    this.Emissions = Emissions;
  }

  public int getThrustToWeightRatio(){
    return this.ThrustToWeightRatio;
  }

  public int getFuelConsumption(){
    return this.FuelConsumption;
  }

  public int getBypassRatio(){
    return this.BypassRatio;
  }

  public int getEmission(){
    return this.Emissions;
  }
}
