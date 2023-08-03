
public class Liver extends Organ {
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
