public class Demo1 {

  public static void main(String[] args) {
    // Dynamic Polymorphism (Run-time)
    Building building = new House();//
    // Compile-time check
    // building.getCapacity(); // compile error
    // building.print(); // compile error
    House house = (House) building;
    // Compile-time confirm you can call print() method
    // Run-time decide which print() is going to call
    // So, building variable call House's print() method
    building.print2();
    //
    building.print();
    //
    house.buildingPrint();

    // static Polymorphism
    // Method Signature (method name + parameters)
    // Constructor Signature
    House house1 = new House();
    house1.print("Hello");
    house1.print();
    House house2 = new House(3.0d);
    house2.print();
    house2.print("hello");

    // house2.print(3L); method not found


    long l1 = Long.valueOf(1L); // wrapper class -> unbox
    Long l2 = 3L; // wrapper class -> auto-box
    long l3 = 2; // upcasting
    int i2 = (int) 3L; // downcast
    // downcast (Run-time Polymorphism)
    //Cube cube = (Cube) new Container();
    Container test = new Cube();
    Object obj = new Container();
    if (obj instanceof Cube) {
      Cube cube1 = (Cube) obj; // downcast: Object -> Cube
      System.out.println("obj is instance Of Cube");
    }
    Object obj2 = new Container();
    if (obj2 instanceof Container) {
      Container cube2 = (Container) obj2; // downcast: Object -> Container
      System.out.println("obj is instance Of Container");
    }

    /* Container obj3 = new Clone();
    Cube cube4 = (Cube) obj3; */ //java.lang.ClassCastException

     /* Number number = Integer.valueOf(3);
    Double d1 = (Double) number; */ //java.lang.ClassCastException

     Number number = 4d;
    Double d1 = (Double) number; //java.lang.ClassCastException

    

  }

}
