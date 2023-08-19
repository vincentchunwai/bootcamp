public class Bread implements Ingredients {
  private BreadType breadType;

  private Bread(BreadType breadType) {
    this.breadType = breadType;
  }

  public static Bread of(BreadType breadType) {
    return new Bread(breadType);
  }

  public int getPrice() {
    return this.breadType.getPrice();
  }

  @Override
  public String toString() {
    return "Bread: " + breadType.name() + " (" + breadType.getPrice() + ")\n";
  }
}
