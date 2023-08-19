import java.util.Stack;

public class Order {

  private int totalPrice = 0;

  private Stack<Ingredients> burger;

  public Order() {
    burger = new Stack<>();
    burger.push(Bread.of(BreadType.BOTTOM));
  }

  public Stack<Ingredients> addIngredients(Ingredients ingredients) {
    System.out.println("Adding ingredient: " + ingredients.toString());
    burger.push(ingredients);
    return this.burger;
  }

  private Stack<Ingredients> getStack() {
    return this.burger;
  }

  public int getTotalPrice() {
    countPrice(burger);
    return this.totalPrice;
  }
  public int countPrice(Stack<Ingredients> burger) {
    if (burger.peek() != Bread.of(BreadType.TOP))
      burger.push(Bread.of(BreadType.TOP));
    int totalPrice = 0;

    for (Ingredients ingredient : burger) {
        totalPrice += ingredient.getPrice();
    }

    return totalPrice;
}



  public static void main(String[] args) {
    Order order = new Order();
    order.addIngredients(Patty.of(PattyType.BEEF, Sauce.BBQ));
    order.addIngredients(Vegetable.of(VegetableType.LETTUCE));
    order.addIngredients(Extras.of(ExtrasType.BACON));
    System.out.println(order.toString());
  }

  @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Burger Ingredients:\n");
    for (Ingredients ingredient : burger) {
        sb.append(ingredient.toString());
    }
    sb.append("Total Price: ").append(countPrice(burger));
    return sb.toString();
}

}


