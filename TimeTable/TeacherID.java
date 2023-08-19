import java.util.Random;

public class TeacherID {
  private Gender gender;
  private Subject subject;
  private Contract contract;
  private String generatedUniqueID;
  

  public TeacherID(Gender gender, Subject subject, Contract contract){
    this.gender = gender;
    this.subject = subject;
    this.contract = contract;
    this.generatedUniqueID = this.generateID();
  }

  public String generateID(){
    Random random = new Random();
    String uniqueID = "ID : " + this.gender.name().charAt(0) + this.contract.name().charAt(0) 
    + Integer.valueOf(this.subject.name().charAt(0)) + random.nextInt(100);
    return uniqueID;
  }

  @Override
    public String toString() {
        return generatedUniqueID; // Return the generated ID as the string representation
    }

  
  
}
