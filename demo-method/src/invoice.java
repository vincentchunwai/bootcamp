import java.util.Arrays;
public class invoice {
  // A method to calculate item total prices
  public static double[] totalPrice(int[] quantities, double[] unitPrice){ // e.g. 5 x 10.9
    double[] totalPriceCaled = new double [quantities.length];
    for (int i = 0; i < totalPriceCaled.length; i++){
        totalPriceCaled[i] = quantities[i] * unitPrice[i];
    }
    System.out.println(Arrays.toString(totalPriceCaled));
    return totalPriceCaled;
  }
  // A method to calculate total amount of the invoice
  public static double totalInvoice(double[] totalPriceCaled){
    double invoiceTotalAmount = 0;
    for (int i =0; i<totalPriceCaled.length; i++){
      invoiceTotalAmount += totalPriceCaled[i];
    }
    System.out.println(invoiceTotalAmount);
    return invoiceTotalAmount;

  }
  public static void main(String[] args){
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};
    
    double[] totalPriceCaled = totalPrice(quantities, unitPrices);
    totalInvoice(totalPriceCaled);

    //Early Return
    //Parameters Control


  }
  
}
