package AircraftBuilder;

public class AirFiltering {
  
  private boolean needsRepair = false;
  private int levelOfAirFlow = 100;
  private int filteringEfficiency = 100;
  


  public Boolean isNeedsRepair(){
    return this.needsRepair;
  }

  public int getLevelOfAirFlow(){
    return this.levelOfAirFlow;
  }

  public int getFilteringEfficiency(){
    return this.filteringEfficiency;
  }

  

  public void checkFilter(){
    if (levelOfAirFlow < 40 || filteringEfficiency < 60)
    this.needsRepair = true; 
  }

  public void RepairFilter(){
    this.needsRepair = false;
  }
}
