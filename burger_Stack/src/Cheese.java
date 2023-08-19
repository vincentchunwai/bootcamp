public class Cheese implements Ingredients {
  private CheeseType cheeseType;

  private Cheese(CheeseType cheeseType) {
    this.cheeseType = cheeseType;
  }

  public static Cheese of(CheeseType cheeseType) {
    return new Cheese(cheeseType);
  }

  public CheeseType getCheeseType() {
    return this.cheeseType;
  }

  public int getPrice() {
    return this.cheeseType.getPrice();
  }

  @Override
  public String toString() {
    return "Cheese: " + cheeseType.name() + " (" + cheeseType.getPrice() + ")\n";
  }

}
