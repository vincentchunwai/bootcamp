package src;
public class Wrapper {
  public static void main(String[] args){
    // Wrapper Classes, corresponding primitive

    boolean isMale = true; // isMale is Not an object
    Boolean isFemale = true; // isFemale is an object reference


    isMale = false;
    if (isMale) {

    }
    if (isFemale.compareTo(isMale) == 0){


    }
    isFemale = null; // true/ false/ null

    int num = 2;
    Integer num2 = 4; // object reference
    num2 = null;

    num2 = 1000;
    String s = num2.toString();
    Integer i = Integer.valueOf("123"); //123
    System.out.println(i);
    Integer num3 = 4;

    if (num3.compareTo(3) < 0){
      System.out.println("num3 is > 3");
    }

    char c = 'g';
    Character c2 = 'A';
    Character.toLowerCase('B');

    //Difference?
    Character c3 = Character.valueOf('s');
    Character c4 = 's';
  }
  
}
