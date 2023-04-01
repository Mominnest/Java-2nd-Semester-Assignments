import java.util.Scanner;

public class BankAccount {
    int AccountNumber;
    String AccountHolderName;
    double balance;

    public BankAccount(int AccountNumber, String AccountHolderName, double Balance) {
        this.AccountNumber = AccountNumber;
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;


    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount" + amount + "Credited Successfully");

    }

    public void display() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Holder's Name: " + AccountHolderName);
        System.out.println("Balance: "  + balance);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount(221031, "Zuni", 0.0);
        BankAccount account2 = new BankAccount(221032, "Saleem", 0.0);
        BankAccount account3 = new BankAccount(221033, "Ali", 0.0);

        account1.display();
        System.out.println("************************************");
        System.out.println("Enter Amount to credit to Account1:  ");
        double amount = scanner.nextDouble();
        account1.credit(amount);
        account1.display();

        account2.display();
        System.out.println("************************************");
        System.out.println("Enter Amount to credit to Account2:  ");
        amount = scanner.nextDouble();
        account2.credit(amount);
        account2.display();

        account3.display();
        System.out.println("************************************");
        System.out.println("Enter Amount to credit to Account3:  ");
        amount = scanner.nextDouble();
        account3.credit(amount);
        account3.display();
    }
}





