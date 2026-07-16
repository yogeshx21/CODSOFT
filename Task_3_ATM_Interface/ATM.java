import java.util.Scanner;

class BankAccount {
    double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
}

public class ATM {
    BankAccount b;

    public ATM(BankAccount account) {
        b = account;
    }

    public void checkBalance() {
        System.out.println("your total balance is " + b.balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            b.balance = b.balance + amount;
            System.out.println("money added done");
        } else {
            System.out.println("cannot add zero or minus money");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= b.balance) {
                b.balance = b.balance - amount;
                System.out.println("cash out successfully");
            } else {
                System.out.println("not enough money in account");
            }
        } else {
            System.out.println("invalid cash amount entered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(3000.0);
        ATM atm = new ATM(account);

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- ATM ---");
            System.out.println("1. check balance");
            System.out.println("2. deposit money");
            System.out.println("3. withdraw money");
            System.out.println("4. exit");
            System.out.print("select option number: ");
            choice = sc.nextInt();

            if (choice == 1) {
                atm.checkBalance();
            } 
            else if (choice == 2) {
                System.out.print("enter deposit money: ");
                double amt = sc.nextDouble();
                atm.deposit(amt);
            } 
            else if (choice == 3) {
                System.out.print("enter withdraw money: ");
                double amt = sc.nextDouble();
                atm.withdraw(amt);
            } 
            else if (choice == 4) {
                System.out.println("thank you 🙏");
            } 
            else {
                System.out.println("wrong option try again");
            }
        }
        sc.close();
    }
} 
    

