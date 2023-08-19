public class Body {
  BodyType bodyType;

  private Body(BodyType bodyType){
    this.bodyType = bodyType;
  }

  public static Body of(BodyType bodyType){
    return new Body(bodyType);
  }

  public BodyType getBodyType(){
    return this.bodyType;
  }
  public enum BodyType{
    MODERN,
    SPORT,
    VINTAGE,
    ;
  }

  @Override
  public String toString(){
    return "[Body type : " + this.bodyType + "]";
  }
}
