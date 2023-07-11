public class calculator {
  public int add(int num1, int num2){
    return num1 + num2;
  }
  public int minus(int num1, int num2){
    return num1 - num2;
  }
  public int divide(int num1, int num2){
    return num1/num2;
  }
  public static void main(String[] args){
    calculator calculator = new calculator();
    int result = calculator.add(17,21);
    result = result + calculator.minus(15,19);
    System.out.println(result);
  }
}
