public enum PattyType {
  CHICKEN(30),
  BEEF(40);

  private int price;

  private PattyType(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
}
