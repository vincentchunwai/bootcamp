import java.util.Random;

public class StudentID {
  private String name;
  private Gender gender;
  private int forms;
  private StudentClass studentClass;
  private String generateID;

  public StudentID(String name, Gender gender, int forms, StudentClass studentClass){
    this.name = name;
    this.gender = gender;
    this.forms = forms;
    this.studentClass = studentClass;
    this.generateID = this.generateStudentID();
  }

  public String generateStudentID(){
    Random random = new Random();
    String uniqueID = "ID : " + this.name.charAt(0) + this.gender.name().charAt(0) 
    + this.studentClass.name().charAt(0) + this.forms + random.nextInt(999);
    return uniqueID;
  }

  @Override
  public String toString(){
    return generateID;
  }
}
