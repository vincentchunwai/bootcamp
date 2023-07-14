public class ProductSequence {
  public static void main(String[] args){
    //0, 1, 2, 3, 4, 5 ......
    // printout 0, 2, 6, 12, 20...
    // print first 20 numbers.

  int a, b; // declare 2 variables in one go
  int firstNum = 1;
  int SecondNum = 2;
  

  for (int i = 0; i < 20; i++){
     int result = firstNum * SecondNum;
     firstNum++;
     SecondNum++;
     
    System.out.println(result);
  }
  
 }

}
