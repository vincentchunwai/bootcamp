import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company2 {
  private Staff[] staffs;

  public Company2(){

  }

  public Company2(Staff[] staffs){
    this.staffs = staffs;
  }

  public void remove(Staff staff){
    List<Staff> staffList = Arrays.stream(staffs)
                .filter(e -> !e.equals(staff))
                .collect(Collectors.toList());

        staffs = staffList.toArray(new Staff[0]);

  }

  public void add(Staff staff){
    Company2 company = new Company2();
    Staff[] original = this.staffs;
    this.staffs = new Staff[this.staffs.length + 1];
    for (int i = 0; i < original.length; i++){
      this.staffs[i] = original[i];
    }

    this.staffs[this.staffs.length] = staff;

    Arrays.stream(company.getStaffs())
      .filter(s -> s.getSalary() > 20000)
      .map()
      .collect();
    List<Person> persons = Arrays.stream(company.getStaffs())
         .filter(s -> s.getSalary() > 20000)
         .map(e -> new Person(e.getName()))
         .collect(Collectors.toList());


  }
}

