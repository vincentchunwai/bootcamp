package Objects;

public class ObjectDemo {
  // Rule 1: All class extends Object implicitly
  String name = "hello";

  @Override
  public String toString(){
    return this.name;
  }


  public static void main(String[] args) {
    // Example 1: ObjectDemo extends Object
    ObjectDemo objectDemo = new ObjectDemo();
    // hash Code --> int
    System.out.println(objectDemo.hashCode());
    // Because hash code has a short range of value storage
    // so, it cannot store all memory address (object reference) in your machine
    int[] arr = new int[] {1, 2, 3};
    System.out.println(arr); // [I@2f92e0f4
    System.out.println(arr.toString());
    System.out.println(arr.hashCode()); //798154996

    
    String str = "abc";
    System.out.println("abc hashcode() = " + str.hashCode()); //96354
    // a * 31^2 + b * 31^1 + c
    System.out.println(97 * (int) Math.pow(31,2) + 98 * 31 + 99); //96354
    Integer i1 = 3;
    System.out.println(i1.hashCode()); //3
    Long l1 = 100L;
    System.out.println(l1.hashCode());
    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());
    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    if ( a == b ){ // check real address

    }


    //equals()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2));


    // Primitives, for comparison. we use ==

    // Wrapper Class, for comparison, we use equals
    Integer j1 = 128;
    Integer j2 = 128;
    System.out.println(j1.equals(j2));
    j1 = 127;
    j2 = 127;
    System.out.println(j1.equals(j2));

    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1.equals(bool2));

    System.out.println(bool1 == false); //unboxing


    
     
  }
}
