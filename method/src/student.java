import java.util.Arrays;

public class student {
  String name;
  int age;
  int classNum;
  int[] marks;
  String[] subjects;
  public student (String name, int age, int classNum, int[] marks, String[] subjects){
    this.name = name;
    this.age = age;
    this.classNum = classNum;
    this.marks = marks;
    this.subjects = subjects;
  }

  public double averageMarks(int[] marks){
    int average = 0;
    for (int i = 0; i < marks.length; i ++){
      average += marks[i];
    }
    return (double)(average/marks.length);

  }
  public void displayInfo (){
    System.out.println("name = " + name + " | age = " + age + " | class number = " + classNum + 
    " | average mark = " + averageMarks(marks));
    System.out.println("Subjects and marks : ");
    for (int i = 0; i < subjects.length; i++){
      System.out.println(subjects[i] + ":" + marks[i]);
    }
    
  }
}
