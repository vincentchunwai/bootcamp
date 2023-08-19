import java.util.Arrays;

public class Pair<T, U> {
  
  T number1;
  U number2;

  private Pair(T number1, U number2){
    this.number1 = number1;
    this.number2 = number2;
  }

  public static <T, U> Pair<T, U> of (T number1, U number2){
    return new Pair<>(number1, number2);
  }

  public void setNumber1(T number1){
    this.number1 = number1;
  }

  public void setNumber2(U number2){
    this.number2 = number2;
  }

  public T getNumber1(){
    return this.number1;
  }

  public U getNumber2(){
    return this.number2;
  }

  @Override
  public String toString(){
    return "(" + number1 +", " + number2 + ")";
  }

  public static <K> void swap(K[] array, int index1, int index2){
    if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 > array.length)
    throw new IllegalArgumentException("Invalid indices");

    K temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  public static void main(String[] args) {
    Pair<String, Integer> pair1 = Pair.of("First", 24);
    System.out.println(pair1.toString());
    Integer[] test = {1, 3, 2, 9, 20};

    Pair.swap(test, 0, 4);
    System.out.println(Arrays.toString(test));
  }
}
