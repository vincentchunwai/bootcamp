import java.time.LocalTime;
import java.time.LocalDate;

public class TimetablePrinter {
  public static void printTimetable(ScheduledEntry[][] timetable,
      Classroom[] classrooms, TimeSlot[] timeSlots) {

    System.out.print("Time Slot\t");
    for (Classroom classroom : classrooms) {
      System.out.print(classroom.getName() + "\t");
    }
    System.out.println();


    for (int i = 0; i < timeSlots.length; i++) {
      System.out.print(timeSlots[i].getStartTime() + " - "
          + timeSlots[i].getEndTime() + "\t");
      for (int j = 0; j < classrooms.length; j++) {
        ScheduledEntry entry = timetable[i][j];
        if (entry != null) {
          System.out.print(
              entry.getSubject() + " (" + entry.getTeacher().getName() + ")\t");
        } else {
          System.out.print("-\t");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    TimeSlot[] timeSlots =
        {new TimeSlot(LocalTime.of(8, 0), LocalTime.of(9, 30)),
            new TimeSlot(LocalTime.of(9, 30), LocalTime.of(11, 0)),
            new TimeSlot(LocalTime.of(11, 30), LocalTime.of(12, 30))

        };
    Teacher teacher = new Teacher("John", 29, Gender.MALE, Subject.CHINESE,
        Contract.FULL_TIME);
    Teacher teacher1 = new Teacher("Sam", 29, Gender.MALE, Subject.ENGLISH,
        Contract.FULL_TIME);
    Teacher teacher2 = new Teacher("Mathew", 29, Gender.MALE, Subject.MATH,
        Contract.FULL_TIME);
    Teacher teacher3 = new Teacher("Mathew", 29, Gender.MALE, Subject.MATH,
        Contract.FULL_TIME);

    Classroom[] classrooms = {new Classroom(ClassroomType.LABORATORY, "A101"),
        new Classroom(ClassroomType.LECTURE_CLASSROOM, "B202"),
        new Classroom(ClassroomType.LECTURE_CLASSROOM, "C302")

    };
    classrooms[0].addTeacher(teacher);
    classrooms[1].addTeacher(teacher1);
    classrooms[0].addTeacher(teacher2);
    classrooms[2].addTeacher(teacher3);


    ScheduledEntry[][] timetable =
        new ScheduledEntry[timeSlots.length][classrooms.length];
    ScheduledEntry entry1 = new ScheduledEntry(LocalDate.of(2023, 8, 10),
        timeSlots[0].getStartTime(), timeSlots[0].getEndTime(), Subject.CHINESE,
        teacher);
    ScheduledEntry entry2 = new ScheduledEntry(LocalDate.of(2023, 8, 10),
        timeSlots[1].getStartTime(), timeSlots[1].getEndTime(), Subject.ENGLISH,
        teacher1);
    ScheduledEntry entry3 = new ScheduledEntry(LocalDate.of(2023, 8, 10),
        timeSlots[2].getStartTime(), timeSlots[2].getEndTime(), Subject.MATH,
        teacher3);

    timetable[0][0] = entry1;
    timetable[1][1] = entry2;
    timetable[2][2] = entry3;

    printTimetable(timetable, classrooms, timeSlots);
  }
}

