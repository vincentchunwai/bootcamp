public record Person1 (String name, int age, int salary) implements TestInterface {
  
  //Immutable Object
  //Private final String name;
  //Support interface, but cannot further extends Object
  //Private final int age;

  //No empty constructor. All-args constructor only
  //All Getters
  //No Setters
  //No instance variable

  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constant

  public boolean isElderly(int age){
    return age >= 65;
  }

  public static int add(int x, int y){
    return x+ y;
  }
  public void read(){
    System.out.println(this.name + "is reading");
  }
}
