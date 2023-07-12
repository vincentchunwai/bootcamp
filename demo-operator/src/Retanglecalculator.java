import java.util.Scanner;



public class Retanglecalculator {
  

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double width;
    double height;
    System.out.println("Enter the height of the rectangle");
    height = sc.nextDouble();
    System.out.println("Enter the width of the rectangle");
    width = sc.nextDouble();

    sc.close();
    double area = width * height;
    System.out.println("area = " + area);


    
  }
}
