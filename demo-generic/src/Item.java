public abstract class Item {
  int price;
  String description;
  String header;

  public Item(){
    
  }

  public Item(int price){
    this.price = price;
  }
   public int getPrice(){
    return this.price;
   }
}
