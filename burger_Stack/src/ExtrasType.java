public enum ExtrasType {
  BACON(8),
  MUSHROOM(8),
  FRIED_ONION(4),
  AVOCADO(10),
  ;

  private int price;

  private ExtrasType(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
}
