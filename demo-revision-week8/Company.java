import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
  private List<Staff> staffs;
  public static int COUNTER;


   Company(List<Staff> staffs){
    this.staffs = new ArrayList<>(staffs);
   }

   Company(){
    this.staffs = new ArrayList<>(); 
   }

   public List<Staff> getStaffs(){
    return  this.staffs ;
   }

   public void add(Staff staff){
    this.staffs.add(staff);
    COUNTER++;
   }

   public Object getStaffName(int staffId){
    return staffs.stream()
      .filter(e -> e.getId() == staffId) // List<Staff>
      .map(s -> s.getName()) // Convert List<Staff> to List<String>
      .findAny() // Optional<String>
      .orElse(""); // String
   }

   public static void main(String[] args) {
      Company company = new Company();
      company.getStaffs().add(new Staff(1, 20000, "John"));
      company.add(new Staff(2, 20000, "Peter"));

      company.getStaffName(1);
      System.out.println(company.getStaffName(2));
   }
}
