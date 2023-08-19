import java.util.Objects;

public class Department {
  String name;

  public Department(String name){
    this.name = name;
  }

  public Department of(String name){
    return new Department(name);
  }

  @Override
  public String toString(){
    return " /Department : name = " + this.name;
  }

  @Override
  public boolean equals(Object o){
    if (o == this)
    return true;
    if (!(o instanceof Department))
    return false;
    Department department = (Department) o;
    return Objects.equals(department.name,this.name);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }
}
