import java.util.Scanner;
import java.io.*;

public class AtmMachine {
   
   public static void checkBalance() {
      System.out.println("\tYour current balance is " + BalanceInquiry.getBalance());
   }

   public static void withdrawMoney() {
      if (BalanceInquiry.balance == 0) {
         System.out.println("\tYour current balance is 0 (zero)");
         System.out.println("\tYou cant withdraw!");
         System.out.println("\tYou need to deposit more money");
      } else if (BalanceInquiry.balance <= 500) {
         System.out.println("\tYou do not have sufficient money to withdraw");
         System.out.println("\tChecked your balance to see your money in the bank");
      } else if (Withdraw.withdraw > BalanceInquiry.balance) {
         System.out.println("\tAmount withdraw is greater than your balance");
         System.out.println("\tPlease check entered amount and check your balance");
      } else {
         BalanceInquiry.balance -= Withdraw.withdraw;
         System.out.println("\tAmount withdrawal : " + Withdraw.withdraw);
         System.out.println("\tYour balance : " + BalanceInquiry.balance);
      }
   }

   public static void depositMoney() {
      System.out.println("\n\tYou deposited amount of : " + Deposit.getDeposit());
   }

   public static void main(String[] args) {
      
      Scanner read = new Scanner(System.in);

      int select = 0;
      int choice = 0;

      System.out.println("====================================================");
      System.out.println("\tWelcome to this simple ATM machine");
      System.out.println("====================================================");
      System.out.println();

      do {
         try {
            do {
               System.out.println("\tPlease select ATM Transactions");
               System.out.println("\tPress [1] Deposit");
               System.out.println("\tPress [2] Withdraw");
               System.out.println("\tPress [3] Balance Inquiry");
               System.out.println("\tPress [4] Exit");

               System.out.println("\n\tWhat would you like to do? ");
               select = read.nextInt();

               if (select > 4 || select < 1) {
                  System.out.println("\tPlease select correct transaction");
               } else {
                  switch (select) {
                     case 1:
                        System.out.print("\tEnter amount deposit money : ");
                        Deposit.deposit = read.nextDouble();
                        BalanceInquiry.balance += Deposit.deposit;
                        depositMoney();
                        break;
                     
                     case 2:
                        System.out.print("\n\tTo withdraw, make sure you have sufficient balance in your account.");
                        System.out.println();
                        System.out.print("\tEnter amount of money to withdraw : ");
                        Withdraw.withdraw = read.nextDouble();
                        withdrawMoney();
                        break;
                     
                     case 3:
                        checkBalance();
                        break;
                  
                     default:
                        System.out.println("\n\tTransaction Exit");
                        break;
                  }
               }
            } while (select > 4);
            
            do {
               try {
                  System.out.println("\n\tWould you like to try another transaction?");
                  System.out.println("\n\tPress[1] Yes \n\tPress[2] No");
                  System.out.print("\tEnter choice: ");
                  choice = read.nextInt();

                  if (choice > 2) {
                     System.out.println("\n\tPlease select correct choice.");
                  }
               } catch(Exception e) {
                  System.out.println("\tError input! Please enter a number only.");
                  read = new Scanner(System.in);
                  System.out.println("\tEnter your choice : ");
                  choice = read.nextInt();
               }
            } while (choice > 2);
      
         } catch(Exception e) {
            System.out.println("\tError input! Please enter a number only.");
            read = new Scanner(System.in);
            System.out.println("\tEnter your choice : ");
            select = read.nextInt();
         }     
      } while (choice <= 1);
      System.out.println("\n\t Thank you for banking with us.");
   }
}