import java.util.ArrayList;

public class ShoppingCart<T extends CheckOutItem> {

  private ArrayList<T> Items;

  public ShoppingCart(){
    Items = new ArrayList<>();
  }

  public int totalAmount(){
    int sum = 0;
    for(CheckOutItem item: this.Items){
      sum += Math.max(0, item.getPrice()) * Math.max(0, item.getQuantity());
    }
    return sum;
  }

  public void add(T item){
    Items.add(item);
  }

  public void add(int quantity, DisplayItem displayItem){
    CheckOutItem checkOutItem = new CheckOutItem(quantity, displayItem.getPrice());
    Items.add(checkOutItem);
  }

  public void addFood(T item){
    Items.add(item);
  }

  public boolean remove(T item){
    return Items.remove(item);
  }

  public void clear(){
    this.Items.clear();
  }


  public static void main(String[] args) {
    ShoppingCart<Item> cart = new ShoppingCart<>();
    cart.add(new Rice());
    // cart.add(new Food()); // Food is abstract
    ShoppingCart<Drink> cart2 = new ShoppingCart<>();
    ShoppingCart<Food> cart3 = new ShoppingCart<>();
    ShoppingCart<Rice> cart4 = new ShoppingCart<>();
    
  }

  public static <T extends Number> Box<T> getBox(T element){
    return new Box<>(element);
  }
}
