package OOPS.AccessModifier;

// Base class – Bank
class Bank {
    // Private – accessible only within this class
    private double balance;

    // Default (no modifier) – accessible within same package
    String bankName = "ABC Bank";

    // Protected – accessible in same package and in child classes
    protected String branchName;

    // Public – accessible everywhere
    public String CEO = "Mr. Smith";

    // Constructor
    Bank(double balance, String branchName) {
        this.balance = balance;
        this.branchName = branchName;
    }

    // Private method
    private void showBalance() {
        System.out.println("Bank balance: $" + balance);
    }

    // Default method
    void displayBankName() {
        System.out.println("Bank name: " + bankName);
    }

    // Protected method
    protected void displayBranch() {
        System.out.println("Branch name: " + branchName);
    }

    // Public method
    public void displayCEO() {
        System.out.println("CEO: " + CEO);
    }

    // Public method to access private balance
    public void checkBalance() {
        showBalance(); // private method accessed within class
    }
}

// Child class – BankBranch
class BankBranch extends Bank {
    BankBranch(double balance, String branchName) {
        super(balance, branchName);
    }

    void branchDetails() {
        System.out.println("Accessing protected member from parent: " + branchName);
        displayBranch(); // protected method
    }
}

public class AccessModifierExample {
    public static void main(String[] args) {
        Bank b = new Bank(5000, "Matunga Branch");

        // Accessing default member – same package
        b.displayBankName();

        // Accessing public member
        b.displayCEO();

        // Accessing private member – NOT allowed
        // b.showBalance(); // ❌ Compile-time error

        // Accessing private member via public method
        b.checkBalance();

        System.out.println("------------------");

        // Child class object
        BankBranch branch = new BankBranch(3000, "Mahim Branch");

        // Accessing protected member and method via child class
        branch.branchDetails();

        // Accessing public method
        branch.displayCEO();
    }
}
