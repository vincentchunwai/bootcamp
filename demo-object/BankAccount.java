
public class BankAccount{
  private String accountNum;
  private String accountHolder;
  private double balance;

  public BankAccount(String accountNum, String accountHolder, double balance){
    this.accountNum = accountNum;
    this.accountHolder = accountHolder;
    this.balance = balance;
  }
  public void deposit(double amount){
    if (amount > 0){
      balance += amount;
      System.out.println("Deposit of" + amount + "successful");
    } else {System.out.println("Deposit failed");}
  }
  public void withdraw(double amount){
    if(amount > 0 && amount < balance){
      balance -= amount;
      System.out.println("withdraw of " + amount + "successful");
    } else {
      System.out.println("Insufficient funds or invalid amount. Withdraw failed");
    }
  }
  public void checkBalance(double amount){

  }
  public void transfer(double amount, BankAccount otherAccount){
    if(amount > 0 && amount < balance){
      balance -= amount;
      otherAccount.balance += amount;
      System.out.println("Transfer of " + amount + "successful");
    } else {
      System.out.println("Insufficient funds or invalid amount. Transfer failed");
    }
  }
}
