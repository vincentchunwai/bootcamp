public class Person{ //template
  // Describe the person by attributes
  private int age;
  private String name;
  char gender;
  public static boolean isMale(char gender) {//belongs to class
    if ( gender == 'F'){
      return false;
    }
    return true;
  }
  public boolean isMale(){ // each
    if ( this.gender == 'F'){
      return false;
    }
    return true;
  }
  public void setAge(int TheAge){
    age = TheAge;
  }
  public int getAge(){
    return this.age;
  }
  public void setGender(char gender){
    this.gender = gender;
  }
  public char getGender(){
    return this.gender;
  }

  public void printInfo(){
    System.out.println("Name = " + name + "| age = " + age + "| gender = " + gender);
  }
  public Person(int age, String name, char gender){
    this.age = age;
    this.name = name;
    this.gender = gender;
  }
  // ...
  public static void main(String[] args){
    String s = "abc";
    Person p = new Person(18, "John", 'M'); // Produce empty person object, with default value
    Person p2 = new Person(19, "Vincent", 'F'); // Produce empty person object, with default value
    BankAccount account = new BankAccount("465", "Vincent", 800.9);
    account.deposit(400);
    char male = 'M';
    Boolean ans = isMale(male);
    System.out.println(ans);
    
    //
    p.printInfo();
    p2.printInfo();
    p2.setAge(15);
    p2.printInfo();
    p.setGender('M');
    System.out.println(p.getGender());

    System.out.println(Person.isMale('F'));
    System.out.println(p.isMale());

    Computer computer = new Computer(); // Computer() -> empty constructor
    computer.SetColor("RED");
    computer.SetRam(128);
    computer.SetWeight( 2);

    Computer computer2 = new Computer(16, 2, "Yellow"); // kind of setter
    computer2.getColor(); // -> yellow
    computer.SetColor("Black");
    System.out.println(computer.getColor());

    p.setAge(15);
    // p.age(15); private
    p.getAge(); //15
  }

  
}