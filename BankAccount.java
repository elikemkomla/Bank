import java.util.Scanner;
 public class BankAccount {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    BankAccount account = new BankAccount(1000);
    account.deposit(500);
    account.withdraw(5023);  
    System.out.println("Has a balance of " + account.getBalance());
  }
  public double balance;
   public BankAccount(double intialBalance)
  {
    balance = intialBalance;  
  }
  public void deposit(double depositAmount)
  {
    balance += depositAmount;
  }
  public void withdraw(double withdrawAmount)
  {

    if (withdrawAmount > balance){    

      System.out.println("Insufficient Funds!!!");

      

    } else {

      balance -= withdrawAmount;

      

    }

  }
  public double getBalance()

  {

    return balance;

  }


}

