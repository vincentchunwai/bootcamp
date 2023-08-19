public class Vegetable implements Ingredients{
  
  private VegetableType vegetableType;

  private Vegetable(VegetableType vegetableType){
    this.vegetableType = vegetableType;
  }

  public static Vegetable of(VegetableType vegetableType){
    return new Vegetable(vegetableType);
  }

  public VegetableType getVegetableType(){
    return this.vegetableType;
  }

  public int getPrice(){
    return this.vegetableType.getPrice();
  }

  @Override
  public String toString() {
    return "Vegetable: " + vegetableType.name() + " (" + vegetableType.getPrice() + ")\n";
  }
  
}
