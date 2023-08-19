//package TimeTable;
import java.util.List;
import java.util.ArrayList;

public class Classroom {
  private String name;
  private ClassroomType classroomType;
  private List<Teacher> teachers;
  private List<Student> students;
  private List<ScheduledEntry> scheduledEntries;

  public Classroom(ClassroomType classroomType, String name){
    this.name = name;
    this.classroomType = classroomType;
    this.teachers = new ArrayList<>();
    this.students = new ArrayList<>();
    this.scheduledEntries = new ArrayList<>();
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public ClassroomType getClassroomType(){
    return this.classroomType;
  }

  public List<Teacher> getTeachers(){
    return this.teachers;
  }

  public List<Student> getStudents(){
    return this.students;
  }

  public List<ScheduledEntry> getScheduledEntries(){
    return this.scheduledEntries;
  }

  public void addTeacher(Teacher teacher){
    this.teachers.add(teacher);
  }

  public void addStudent(Student students){
    this.students.add(students);
  }

  public void addScheduledEntry(ScheduledEntry scheduledEntry){
    this.scheduledEntries.add(scheduledEntry);
  }

  public void removeTeacher(Teacher teacher){
    this.teachers.remove(teacher);
  }

  public void removeStudent(Student student){
    this.students.remove(student);
  }
}
