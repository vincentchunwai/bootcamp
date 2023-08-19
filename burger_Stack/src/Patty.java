public class Patty implements Ingredients{
  private PattyType pattyType;
  private Sauce sauce;

  private Patty(PattyType pattyType, Sauce sauce){
    this.pattyType = pattyType;
    this.sauce = sauce;
  }

  public static Patty of(PattyType pattyType, Sauce sauce){
    return new Patty(pattyType, sauce);
  }

  public Sauce getSauce(){
    return this.sauce;
  }

  public PattyType getPattyType(){
    return this.pattyType;
  }

  public int getPrice(){
    return this.pattyType.getPrice();
  }

  @Override
    public String toString() {
        return "Patty: " + pattyType.name() + " with " + sauce.name() + " (" + (pattyType.getPrice()) + ")\n";
    }
}
