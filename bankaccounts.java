class BankAccount
{
     private double balance;
     public BankAccount(double initialBalance)
     {
        if(initialBalance > 0)
        {
            this.balance = initialBalance;
        }
        else
        {
           this.balance = 0;
         }
     }
     public void deposit(double amount)
     {
        if(amount>0)
        {
           balance = balance+amount;
           System.out.println("Deposited $:"+amount);
        }
        else
        {
            System.out.println("Deposited amount must be positive");
        }
     }
     public double getBalance()
     {
         return balance;
      }
}
public class Main1
{
    public static void main(String args[])
   {
     BankAccount account = new BankAccount(1000);
     account.deposit(500);
     System.out.println("Current Balance is:"+account.getBalance());
  }
}