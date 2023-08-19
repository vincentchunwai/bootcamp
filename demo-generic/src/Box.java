import java.util.ArrayList;

public class Box<T extends Number>{

  private ArrayList<T> numbers;

  private Box(){
    numbers = new ArrayList<>();
  }

  public Box(T number){
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public static <T extends Number> Box<T> of(T number){
    return new Box<>(number);
  }

  public ArrayList<T> getNumber(){
    return this.numbers;
  }

  /* public void setNumbers(T[] numbers){
    this.numbers = numbers;
  } */

  public void add(T number){
    numbers.add(number);
  }

  public int size(){
    return this.numbers.size();
  }
  public static void main(String[] args) {
    //Box<String> box1 = new Box<>();
    Box<Integer> box2 = Box.of(100);
    System.out.println(box2.size());

    
  }
}
