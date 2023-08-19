public enum ClassroomType {
  LECTURE_HALL(3, 100, Subject.AllSubject() ),
  LABORATORY(2, 40, Subject.LabGroup()),
  COMPUTER_ROOM(2, 30, Subject.IT),
  LECTURE_CLASSROOM(20, 25, Subject.AllSubject()),
  ;

  int numOfRoom;
  int capacity;
  Subject[] subjects;
  Subject subject;

  private ClassroomType(int num, int capacity, Subject subject){
    this.numOfRoom = num;
    this.capacity = capacity;
    this.subject = subject;
  }
  

  private ClassroomType(int num, int capacity, Subject[] subjects){
    this.numOfRoom = num;
    this.capacity = capacity;
    this.subjects = subjects;
  }
}
