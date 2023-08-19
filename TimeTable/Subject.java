//package TimeTable;

public enum Subject {
  CHINESE,
  ENGLISH,
  MATH,
  ART,
  SCIENCE,
  HISTORY,
  MUSIC,
  GEOGRAPHY,
  PE,
  BIOLOGY,
  CHEMISTRY,
  IT,
  PHYSICS,
  ;

  public static Subject[] LabGroup(){
    Subject[] LabGroup = {SCIENCE, BIOLOGY, CHEMISTRY, PHYSICS};
    return LabGroup;
  }

  public static Subject[] AllSubject(){
    Subject[] all = Subject.values();
    return all;
  }
}
