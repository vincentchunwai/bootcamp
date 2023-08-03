public class App {
  public static void main(String[] args) {
    // enum
    // 1. Finite number of members 
    // Example1 : (Direction: LEFT, RIGHT, UP, DOWN)
    // Example2 : (Weekday: Monday, Tuesday ...)
    // Example3 : (Double Entry: Debit, Credit)
    // 2. Growth of enum elements (Change %)
      System.out.println(Direction.EAST); // enum override toString method// auto to-String
      System.out.println(Direction.EAST.name());
      System.out.println(Direction.NORTH);
  
      Direction east = Direction.EAST; //TBC (heap)
      System.out.println(east == Direction.NORTH); // false // checking address because only one unique enum
      System.out.println(east != Direction.NORTH); 
      // == and != are checking the object reference
  
      // values() -> loop
      for (Direction d: Direction.values()){ // Direction.values() -> static method
        System.out.println(d.name());
      }
  
      System.out.println(Direction.SOUTH.ordinal());//1
      System.out.println(Direction.EAST.ordinal());//0
  
      System.out.println(east.getDegree());
      System.out.println(east.getDirection());
    }
  }
