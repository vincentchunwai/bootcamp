import java.util.Objects;

public class Staff {
  private int id;
  private double salary;
  private String name;

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }
  public Staff(int id, double salary, String name){
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if ( o == null || getClass() != o.getClass())
    return false;
    Staff staff = (Staff) o;
    return Objects.equals(staff.id, this.id) ;
  }
}