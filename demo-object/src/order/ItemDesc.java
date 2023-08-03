
public class ItemDesc {
  
  private String header;

  private String body;

  public ItemDesc(String header, String body){
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDesc itemdesc = new ItemDesc("Item A", "90% discount");
    ItemDesc itemdesc2 = new ItemDesc("Item B", "70% discount");
    ItemDesc itemdesc3 = new ItemDesc("Item C", "Buy one get one.");
    Transaction t = new Transaction(1, itemdesc, 3, 10.5);
    Transaction t2 = new Transaction(1, itemdesc2, 4, 20.5);
    Transaction t3 = new Transaction(1, itemdesc3, 2, 192);
    Order order = new Order(new Transaction[] {t, t2});
    Order order2 = new Order(new Transaction[] {t, t2, t3});
    System.out.println(order2.getTotal());
    System.out.println(order.getTotal());
  }

}
