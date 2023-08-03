public interface Move extends BigMove{
  
  // No instance variables -> camlcase

  // Constant
  static final int MAX_SPEED = 10; // public

  //Java -> naming convention -> Camlcase
  // e.g "noOfDay" 

  void jump(); // public abstract
  
  // After Java 8, lambda, stream

  default void print(){// instance method --> compatibility
    System.out.println("I am Java 8 default");
  }

  static String concat(String a, String b){
    return a + b;
  }
  

}
