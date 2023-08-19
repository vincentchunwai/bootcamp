public enum CheeseType {
  CHEDDAR(12),
  SWISS(8),
  AMERICAN(4),
  BLUECHEESE(10),
  ;

  private int price;

  private CheeseType(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }

}
