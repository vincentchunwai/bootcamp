// package TimeTable;

import java.time.LocalTime;

public class TimeSlot {
  private LocalTime startTime;
  private LocalTime endTime;

  public TimeSlot(LocalTime startTime, LocalTime endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public LocalTime getStartTime(){
    return this.startTime;
  }

  public LocalTime getEndTime(){
    return this.endTime;
  }


}
