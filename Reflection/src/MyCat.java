public class MyCat {
  private String name;
  private int age;

  private MyCat(String name, int age){
    this.name = name;
    this.age = age;
  }

  public static MyCat of(String name, int age){
    return new MyCat(name, age);
  }

  public String getName(){
    return this.name;
  }
}
