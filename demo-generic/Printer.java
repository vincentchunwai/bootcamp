import java.util.ArrayList;

public class Printer<T/* , U, V, S */> { // 1. Class Signature, add <>, T represents any Type

  T value;
  T[] numbers;
  Object object;
  ArrayList<T> list;

  /*
   * U number; V object; S theEnum;
   */
  public T getValue() {
    return this.value;
  }

  /* public U getNumber() {
    return this.number;
  }

  public S getEnum() {
    return this.theEnum;
  } */

  public Object getObject() {
    return this.object;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    // Strong type checking -> check if you put a solid class into<>

    p1.setValue("abc");

    Printer<Integer> p2 = new Printer<>();
    Object[] objectList = new Object[10];



    Printer<Double> p3 = new Printer<>();

    p1.print();

    Printer<Boolean> p4 = new Printer<>();
    //p4.setValue("String");
    System.out.println(((String) p1.getObject()).charAt(0));
  }
}
