public class Demo {

  public static void main(String[] args){
    Car car = new Car(4, 2, "blue", "Tesla");
    Car car2 = new Car(4, 4, "grey", "Ford");
    System.out.println(car2.GetNumOfWheel());
    System.out.println(car2.GetCapacity());
    System.out.println(car2.getClass());

    // car2 = new Car(5, 10, "Yellow");
    car.SetColor("Yellow"); // car2 -> object reference, storing the object
    car.SetColor("Blue");
    Person person = new Person(18, "Vincent", 'M');
    Computer computer = new Computer(19, 6, "black");
    String str = new String("Hello"); // str -> object reference
    System.out.println(str); // ** Hello **
    System.out.println(car2.GetColor()); // Car@5305068a -> object reference storing object
    System.out.println(car2);
    car2 = new Car(3, 4, "Black", "BMW"); 
    //car2 = null; //JVM automatic heap dump
    car2.printInfo(); // overwrite car2's info
    car2.printInfo();
    
    System.out.println(car2);

    int[] arr = new int[] {1, 3, 2};
    for (int i = 0; i < arr.length; i++){
      Integer sum = 0; // object declaration 3 times
    }
    String str1 = "Hello";
    String str2 = "World";
    String str3 = Array3.concat(str1, str2);
    System.out.println(str3);

     CarFactory carFactory = new CarFactory(); // non static method needs new object
    carFactory.changeColor(car2, "White");
    car2.printInfo();

    Student1 student = new Student1("Vincent", "Cheung", 15);
    System.out.println(student.fullName());
    System.out.println(student.isAdult());
  }
  
}
