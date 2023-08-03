
public class Organ {

  private String name;
  private String function;

  public Organ(String name, String function) {
    this.name = name;
    this.function = function;
  }

  public String getName() {
    return name;
  }

  public String getFunction() {
    return function;
  }

  


  public static class Lung extends Organ {
    private int capacity;

    public Lung(String name, String function, int capacity) {
      super(name, function);
      this.capacity = capacity;
    }

    public int getCapacity() {
      return this.capacity;
    }

    public void breathe() {
      System.out.println(
          "Taking a deep breath with lung capacity: " + capacity + " ml");
    }
  }

  public static class Kidney extends Organ {
    private double filtrationRate;
    private double wasteProduction;

    public Kidney(String name, String function, double filtrationRate,
        double wasteProduction) {
      super(name, function);
      this.filtrationRate = filtrationRate;
      this.wasteProduction = wasteProduction;
    }

    public double getFiltrationRate(){
      return this.filtrationRate;
    }

    public double getWasteProduction(){
      return this.wasteProduction;
    }

    public void filter(){
      double filteredAmount = filtrationRate/60;
      wasteProduction += filteredAmount;
      System.out.println("Kidney filtering blood. Waste products accumulated: " + wasteProduction + " ml");
    }

    public void excreteUrine(){
      double urineAmount = wasteProduction;
      wasteProduction = 0.0;
      System.out.println("Kidney excreting urine. Urine amount: " + urineAmount + " ml");
    }


  }

  public static class Heart extends Organ {
    private double HeartRate;
    private boolean isBeating;
    public Heart(String name, String function, double HeartRate) {
      super(name, function);
      this.HeartRate = HeartRate;
      this.isBeating = false;
    }

    public double getHeartRate(){
      return HeartRate;
    }

    public boolean isBeating(){
      return isBeating;
    }

    public void startBeating(){
      isBeating = true;
      System.out.println("Heart starts beating at a rate of " + HeartRate + " beats per minute.");
    }

    public void stopsBeating(){
      isBeating = false;
      System.out.println("Heart stops beating.");
    }

    public void pump(){
      if(isBeating = true)
      System.out.println("Heart is pumping blood");
      else
      System.out.println("Heart stops beating. Blood not pumped");
    }

    public double getOxygenRequirement(){
      return HeartRate * 0.1;
    }

    public double getNutrientRequirement(){
      return HeartRate * 0.05;
    }



  }

  public static class Liver extends Organ {
    private double detoxificationRate;
    private double nutritionStorage;
    public Liver(String name, String function, double detoxificationRate) {
      super(name, function);
      this.detoxificationRate = detoxificationRate;
      this.nutritionStorage = 0.0;
    }

    public double getDetoxificationRate(){
      return this.detoxificationRate;
    }

    public double getNutritionStorage(){
      return this.nutritionStorage;
    }

    public void detoxify(){
      double detoxifiedAmount = detoxificationRate / 60;
      System.out.println("Liver detoxifying. Detoxified amount: " + detoxifiedAmount + " ml");
    }

    public void nutritionStorage(double nutrition){
      nutritionStorage += nutrition;
      System.out.println("Liver storing nutrients. Stored nutrients: " + nutritionStorage + " units");
    }

    public void processNutrientsFromFood(Food food){
      double nutrients = food.getNutrientsValue();
      nutritionStorage(nutrients);
    }

  }
  

}

