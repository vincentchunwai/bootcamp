import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance){
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  public Staff of(String name, Department department, int performance){
    return new Staff(name, department, performance);
  }

  @Override
  public String toString(){
    return "[Staff : " + this.name + this.department +"]";
  }


  public static void main(String[] args){
    List<Staff> staffs = Arrays.asList(new Staff("Jim", new Department("HR"), 60)
    , new Staff("Ivy", new Department("IT"), 50)
    , new Staff("John", new Department("HR"), 40));

    staffs.stream()
    .collect(Collectors.groupingBy(staff -> staff.department))
    .forEach((dept,staffList) -> System.out.println(dept + ": " + staffList));

    //
    Map<Boolean, List<Staff>> gradeMap = staffs.stream()
    .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));
    gradeMap.entrySet().stream().forEach(System.out::println);
  }
}
