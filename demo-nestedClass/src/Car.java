public class Car {

  CarType carType;
  Body body;
  Engine engine;

  private Car(Builder builder) {
    this.carType = builder.carType;
    this.body = builder.body;
    this.engine = builder.engine;
  }

  private Car(TeslaBuilder teslaBuilder){
    this.carType = teslaBuilder.carType;
    this.body = teslaBuilder.body;
    this.engine = teslaBuilder.engine;
  }

  public static Builder builder(){
    return new Builder();
  }

  public static TeslaBuilder teslaBuilder(){
    return new TeslaBuilder();
  }

  public enum CarType {
    SPORT_CAR, TESLA, BMW, SUV,;
  }

  public static class Builder {
    CarType carType;
    Body body;
    Engine engine;

    public Builder CarType(CarType carType){
      this.carType = carType;
      return this;
    }

    public Builder Body(Body body){
      this.body = body;
      return this;
    }

    public Builder Engine(Engine engine){
      this.engine = engine;
      return this;
    }

    public Car build(){
      return new Car(this);
    }
  }

  public static class TeslaBuilder{
    CarType carType = CarType.TESLA;
    Body body = Body.of(Body.BodyType.MODERN);
    Engine engine = Engine.of(59);

    public Car buildTesla(){
      return new Car(this);
    }
  }

  @Override
  public String toString(){
    return "[ Car Type : " + this.carType +", " + this.body + ", " + this.engine + "]";
  }
}
