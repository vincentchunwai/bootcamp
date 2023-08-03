public class Student1 {

  // State / Instance Variables
  private String firstName;
  private String lastName;
  private int age;


  public String fullName(){
    return this.firstName + " " + this.lastName;
  }
  // All-argument constructor -> new object (instance)
  public Student1(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }


  // Behaviors / Methods
  /* public String getFirstName(){
    return this.firstName;
  }

  public String getLastName(){
    return this.lastName;
  } */

  /* public static boolean isAdult(int age) {
    return age >= 18;
  } */
  public boolean isAdult(){
    return this.age >= 18;
  }
  
  
  public int getAge(){
    return this.age;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public void setAge(int age){
    this.age = age;
  }

}
