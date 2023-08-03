package abstracts;
public class Student extends Adult{
  // Must implement abstract method

  public Student(){

  }

  public Student(int age, double height){
    super(age, height);
  }
  

  public void sleep() {
    System.out.println("I am student, sleeping");
  }

  public void read(){
    System.out.println("I am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.setAge(19);
    student.sleep();
    student.read();
    student.run();
    student.eat();
    System.out.println(student.getAge());// 0 
  }
  
}
