public class Food {
  private String name;
  private double calories;
  private double nutrientValue;

  public Food(String name, double calories, double nutrientValue){
    this.name = name;
    this.calories = calories;
    this.nutrientValue = nutrientValue;
  }

  public String getName(){
    return this.name;
  }

  public double getCalories(){
    return this.calories;
  }

  public double getNutrientsValue(){
    return this.nutrientValue;
  }
}
