package synchronizedmethod;

public class ATM {

  // If you do not use synchronized , the balance will be negative
  // Which is wrong because bank balance should not be negative
  // Both thread used the resource at the same time
  // ## public  void withdraw(BankAccount account, int amount) {

  // By using synchronized , it allow one thread to used the method at the same time
  public synchronized void withdraw(BankAccount account, int amount) {

    int balance = account.getBalance();
    if (balance - amount < 0) {
      System.out.println("Transaction denied");
    } else {
      System.out.println("Handling transaction...");
      account.debit(amount);
      System.out.println("$" + amount + " withdrawn");
    }
    System.out.println("Current balance: " + account.getBalance());
  }
}
