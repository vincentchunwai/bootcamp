public class Zoo<T>{
  
   T animal; 

  public Zoo(T animal){
    this.animal = animal;
  }

  // Zoo<T> -> return type
  // T -> input parameter
  // <T extends Animal> -> the range of T of the method
  public static <T extends Animal> Zoo<T> of(T animal){
    return new Zoo<>(animal);
  }

  public T getAnimal(){
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal = animal;
  }

  public static void main(String[] args) {
    Zoo<Animal> zoo1 = new Zoo<>(new Dog("abc"));
  }
}
