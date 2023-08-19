//package TimeTable;

public class Teacher{
  private String name;
  private int age;
  private Gender gender;
  private TeacherID id;
  private Subject subject;
  //Availability[] availability;
  private Contract contract;

  public String getName(){
    return this.name;
  }

  public int age(){
    return this.age;
  }

  public Gender gender(){
    return this.gender;
  }

  public Subject getSubject(){
    return this.subject;
  }

  public TeacherID getID(){
    return this.id;
  }

  public Teacher getTeacher(){
    return this;
  }

  public Teacher(String name, int age, Gender gender, Subject subject, Contract contract){
    this.name = name;
    this.age = age;
    this.gender =gender;
    this.subject = subject;
    this.contract = contract;
    id = new TeacherID(this.gender, this.subject, this.contract);
    id.generateID();
  }

  public static void main(String[] args) {
    Teacher teacher = new Teacher("John", 29, Gender.MALE, Subject.ENGLISH, Contract.FULL_TIME);
    System.out.println(teacher.getID());
    Teacher teacher2 = new Teacher("Joe", 28, Gender.MALE, Subject.BIOLOGY, Contract.PART_TIME);
    System.out.println(teacher2.getID());
  }
}
