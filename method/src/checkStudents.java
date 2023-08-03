public class checkStudents {
  public static void main(String[] args) {
    String[] subjects = new String[] {"Chinese", "English", "Mathematics" , "Physics" , "Chemistry"};
    int[] marks = new int[] {13, 9, 18, 27, 79};
    student student1 = new student("John", 13, 4, marks, subjects);
    student1.displayInfo();
    int[] marks2 = new int[] {90, 88, 46, 90, 10};
    student student2 = new student("Bill", 17, 30, marks2, subjects);
    student2.displayInfo();
  }
  
}
