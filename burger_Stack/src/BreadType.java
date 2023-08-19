public enum BreadType {
  TOP(1),
  BOTTOM(1),
  ;

  private int price;

  private BreadType(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
}
