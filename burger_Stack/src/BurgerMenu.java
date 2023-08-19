public class BurgerMenu {
  Order order;

  public BurgerMenu(){
    order = new Order();
  }

  public BurgerMenu addIngredients(Ingredients ingredients){
    order.addIngredients(ingredients);
    return this;
  }

  public BurgerMenu addBread(BreadType breadtype){
    order.addIngredients(Bread.of(breadtype));
    return this;
  }
  public BurgerMenu addCheese(CheeseType cheeseType){
    order.addIngredients(Cheese.of(cheeseType));
    return this;
  }
  public BurgerMenu addPatty(PattyType pattyType, Sauce sauce){
    order.addIngredients(Patty.of(pattyType, sauce));
    return this;
  }

  public BurgerMenu addVegetable(VegetableType vegetableType){
    order.addIngredients(Vegetable.of(vegetableType));
    return this;
  }

  public BurgerMenu addExtras(ExtrasType extrasType){
    order.addIngredients(Extras.of(extrasType));
    return this;
  }
}
