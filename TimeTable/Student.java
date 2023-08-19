public class Student {
  private Gender gender;
  private String name;
  private int forms;
  private StudentClass studentClass;
  private StudentID studentId;

  public Gender getGender(){
    return this.gender;
  }

  public String getName(){
    return this.name;
  }

  public int getForms(){
    return this.forms;
  }

  public StudentClass getStudentClass(){
    return this.studentClass;
  }

  public StudentID getStudentID(){
    return this.studentId;
  }

  public Student(Gender gender, String name, int forms, StudentClass studentClass){
    this.gender = gender;
    this.name = name;
    this.forms = forms;
    this.studentClass = studentClass;
    studentId = new StudentID(this.name, this.gender, this.forms, this.studentClass);
    studentId.generateStudentID(); 
  }


  public static void main(String[] args) {
    Student student= new Student(Gender.MALE, "Sam", 4, StudentClass.A);
    System.out.println(student.getStudentID());
  }
}
