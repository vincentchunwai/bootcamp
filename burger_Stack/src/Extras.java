public class Extras implements Ingredients{

  private ExtrasType extrasType;

  private Extras(ExtrasType extrasType){
    this.extrasType = extrasType;
  }

  public static Extras of (ExtrasType extrasType){
    return new Extras(extrasType);
  }

  public ExtrasType getExtrasType (){
    return this.extrasType;
  }

  public int getPrice(){
    return this.extrasType.getPrice();
  }

  @Override
  public String toString() {
    return "Extras: " + extrasType.name() + " (" + extrasType.getPrice() + ")\n";
  }
}
