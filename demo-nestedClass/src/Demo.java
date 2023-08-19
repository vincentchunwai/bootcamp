public class Demo {
  
  public static void main(String[] args) {
    /* Body body = new Body(Body.BodyType.MODERN);
    Engine engine = new Engine(39); */
    Car car = Car.builder()
    .Body(Body.of(Body.BodyType.MODERN))
    .Engine(Engine.of(39))
    .CarType(Car.CarType.SUV)
    .build();

    Car tesla = Car.teslaBuilder().buildTesla();

    System.out.println(car);
    System.out.println(tesla);
  }
}
