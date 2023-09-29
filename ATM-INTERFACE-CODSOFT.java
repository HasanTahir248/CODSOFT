import java.awt.GraphicsDevice.WindowTranslucency;
import java.util.Scanner;
//Creating a bank account class 
class BANK_Account{
  private double balance = 0;
//deposit method
  public void deposit(double amount){
    if (amount > 0){
    balance += amount;
    System.out.println("\nDeposit Successfully in your account\n");
    } else {
      System.out.println("\nSelect an appropriate amount for deposit!\n");
    }
  }
//withdrawl method
  public void withdrawl(double amount){
    if (amount <= balance && amount > 0){
      balance -= amount;
      System.out.println("\nWithdrawl of "+amount+" amount done successfully\n");
    } else {
      System.out.println("\nNot enough balance!\n");
    }
  }
//balance checking method
  public double balance_check(){  
    return balance;
  }
}
//creating atm class
class ATM_Machine {
//creating a starting method for the atm
  public void start(){
   Scanner in = new Scanner(System.in);
    BANK_Account User_Account = new BANK_Account();
    String choice = "yes";
//creating a loop for running the program multiple times
    while(choice.equalsIgnoreCase("yes")){
//atm interface for the user
      System.out.println("\n******************** WELCOME TO ATM ********************\n");
      System.out.println("What do you want to perform:\n");
      System.out.println("1. Deposit \n2. Withdrawl \n3. Check Balance \n");
      int option = in.nextInt();
//performing the method based on condition
      if ( option == 1 ){
        System.out.println("\nEnter amount to deposit in your account: \n");
        double amount = in.nextDouble();
        User_Account.deposit(amount);
      } else if ( option == 2 ){
        System.out.println("\nEnter amount to withdraw from your account: \n");
        double amount = in.nextDouble();
        User_Account.withdrawl(amount);
      } else if ( option == 3 ){
        System.out.println("\n Your Account Balance is: "+ User_Account.balance_check() + " amount\n" );
      } else {
        System.out.println("Select a correct option from the following");
      }
// asking if the user want to do anyother thing
      System.out.println("\nDo you want to do any other thing in your account (yes/no): \n");
      choice = in.next();
       if (choice.equalsIgnoreCase("no")){
         System.out.println("\n*************** THANKS FOR USING OUR SERVICE ***************\n");
       }
    }
  }
}
//main class for running the program
class Main {
  public static void main(String[] args) {
   ATM_Machine account = new ATM_Machine();
    account.start();
  }
}