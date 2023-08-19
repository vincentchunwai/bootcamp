//package TimeTable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ScheduledEntry {
  private LocalDate date;
  private LocalTime startTime;
  private LocalTime endTime;
  private Subject subject;
  private Teacher teacher;
  private List<Student> students;

  public ScheduledEntry(LocalDate date, LocalTime startTime, 
  LocalTime endTime, Subject subject, Teacher teacher){
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.subject = subject;
    this.teacher = teacher;
  }

  public ScheduledEntry(LocalDate date, LocalTime startTime, 
  LocalTime endTime, Subject subject, Teacher teacher, List<Student> students){
    this.date = date;
    this.startTime = startTime;
    this.endTime = endTime;
    this.subject = subject;
    this.teacher = teacher;
    this.students = students;
  }

  public void setDate(LocalDate date){
    this.date = date;
  }

  public void setStartTime(LocalTime startTime){
    this.startTime = startTime;
  }

  public void setEndTime(LocalTime endTime){
    this.endTime = endTime;
  }

  public void setSubject(Subject subject){
    this.subject = subject;
  }
  
  public void setTeacher(Teacher teacher){
    this.teacher = teacher;
  }

  public void addStudent(Student student){
    students.add(student);
  }

  public LocalDate getDate(){
    return this.date;
  }

  public LocalTime getStartTime(){
    return this.startTime;
  }

  public LocalTime getEndTime(){
    return this.endTime;
  }

  public Subject getSubject(){
    return this.subject;
  }

  public Teacher getTeacher(){
    return this.teacher;
  }

  public void removeStudent(Student student){
    students.remove(student);
  }
}
