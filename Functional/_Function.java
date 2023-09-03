import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
  
  public static void main(String[] args) {
    int increment = increment(1);
    System.out.println(increment);

   int increment2 =  incrementByOneFunction.apply(1);

   int multiply = multiplyBy10Function.apply(increment2);
   System.out.println(multiply);
   
   Function<Integer,Integer> addBy1ThenMultiplyBy10 = 
   incrementByOneFunction.andThen(multiplyBy10Function);

   
   System.out.println(addBy1ThenMultiplyBy10.apply(1));

  }

  static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

  static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

  static int incrementAndMultiply(int number, int numtoMultiply){
    return (number + 1) * numtoMultiply;
  }

  static BiFunction<Integer,Integer,Integer> bifunction =
  (num1, num2) -> (num1 * 2) * num2;
  static int increment(int number){
    return number + 1;
  }
}
