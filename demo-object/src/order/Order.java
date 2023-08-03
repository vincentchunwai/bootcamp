
public class Order {
  
  private Transaction[] transactions;

  public Order(Transaction[] transactions){
    // Pass by reference
    this.transactions = transactions;
  }
  // getTotal()
  public double getTotal(){
    double total = 0;
    for (int i = 0; i < this.transactions.length; i++){
        total += this.transactions[i].getSubtotal(0.3);
    }
    return total;
  }
}
