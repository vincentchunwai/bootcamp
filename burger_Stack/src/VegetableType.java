public enum VegetableType {
  LETTUCE(10),
  TOMATO(4),
  ONION(5),
  PICKLES(3),
  ;
  private int price;

  private VegetableType(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
}
