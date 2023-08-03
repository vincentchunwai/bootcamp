import java.util.Objects;
public class Laptop extends Machine {
  // Laptop is subclass(child), Machine is superClass(Parent)

  private Keyboard keyboard;
  private Monitor monitor;
  private int volume;

  // subclass must call superClass constr

  public Laptop() {
    // super(); --> New machine
    super(1.0d);
    // implicitly calls on parent Constructor
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    // this.weight = weight; illegal
    super(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(double weight, String buttonType, int noOfButton, double length,
      double width) {
    super(weight);
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  @Override // Method Overriding
  public void start() {
    super.start();
    System.out.println("Laptop starting ....");
  }

  @Override // Method Overriding
  public void stop() {
    super.stop();
    System.out.println("Laptop stops ....");
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getVolume() {
    return this.volume;
  }

  public void mute() {
    this.volume = 0;
  }

  // Cannot override the final methodin superclass
  /*
   * public static String staticMethod(String x, String y){ return x + y; }
   */
  public static void main(String[] args) {
    Laptop laptop = new Laptop(20, "abc", 100, 15, 10);
    laptop.setWeight(3.0d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(5.0d);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();

    Laptop laptop2 = new Laptop(); // empty constructor
    laptop2.setWeight(10.0d);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("abc", "def"));
    System.out.println(Laptop.staticMethod("abc", "def"));
    /* laptop3.staticMethod("abc", "def"); */ // static method should be accessed in static way
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
      return true;
    
    if (!(o instanceof Laptop))
      return false;
    
    Laptop laptop = (Laptop) o;
    return Objects.equals(laptop.keyboard, this.keyboard) 
    && Objects.equals(laptop.monitor, this.monitor);
  }
}

