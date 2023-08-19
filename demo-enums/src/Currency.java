public enum Currency {
  USD(1, "US Dollar"),
  HKD(2, "Hong Kong Dollar"),
  CNY(3, "Chinese Yuan Renminbi"),
  GBP(4, "British Pound Sterling"),
  ;

  private int id;
  private String description;

  private Currency(int id, String description){
    this.description = description;
    this.id = id;
  }

  public String getDesc(){
    return this.description;
  }

  public int getId(){
    return this.id;
  }

  public static Currency getCurrency(int id){
    for (Currency c: values()){
      if (c.id == id){
        return c;
      }
    }
    return null;
  }

  static void print(double i){
    System.out.println(i);;
  }

  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDesc());
    System.out.println(Currency.valueOf("GBP").getDesc());
    Currency.print(3);
    
  }
}
