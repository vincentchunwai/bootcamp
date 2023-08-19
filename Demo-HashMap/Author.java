import java.util.Objects;
public class Author {
  private String name;
  private int age;

  public Author(String name, int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Author))
    return false;
    Author author = (Author) o;
    return author.name.equals(this.name);
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  @Override
  public String toString(){
    return (this.name + " " + this.age);
  }

  public String getName(){
    return this.name;
  }
}
