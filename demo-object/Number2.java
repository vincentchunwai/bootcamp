public class Number2 {
  int number1;
  int number2;
  String name;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void printInfo() {
    System.out.println("object name: " + name + " number1 = " + number1
        + " and number2 = " + number2);
  }
  public void print(){
    System.out.println("this.number1 = " + this.number1);
    System.out.println("this.number2 = " + this.number2);
  }
  public static int add(int number1, int number2){
    return number1 + number2;
  }


  public void setNumber1(int number1) {
    this.number1 = number1;
  }

  public void setNumber2(int number2) {
    this.number2 = number2;
  }

  public int divide() { // non-static
    this.print(); // non-static method call non-static method
    Number2.add(this.number1, this.number2);
    return this.number2 / this.number1;
  }

  public int divide2(int number1, int number2) {
    return number1 / number2 + this.number1 + this.number2;
  }

  public static int divide(int number1, int number2) {
    Number2 a = new Number2(90,80);
    a.print();
    return number1 / number2;
  }

  public Number2(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public static void main(String[] args) {
    Number2 n1 = new Number2(90, 80);
    n1.setNumber1(13);
    n1.setNumber2(26);

    Number2 n2 = new Number2(29, 80);
    n2.setNumber1(28);
    n2.setNumber2(100);

    System.out.println(n1.divide());
    System.out.println(n2.divide());
    n1.setName("n1");
    n2.setName("n2");
    n2.printInfo();
    n1.printInfo();
    
  }
}
