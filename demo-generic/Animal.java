public class Animal {
  String name;
  int id;

  public Animal(){
    
  }
  public Animal(String name){
    this.name = name;
  }
  public Animal(String name, int id){
    this.name = name;
    this.id = id;
  }

  public String getName(){
    return this.name;
  }
}
