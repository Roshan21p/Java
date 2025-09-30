package OOPS.Abstraction;

// Abstract parent class
abstract class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Abstract method (no body) – must be implemented in child
    abstract void interestRate();

    // Concrete method – optional
    void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

// Concrete subclass
class SBI extends Bank {
    SBI(String bankName) {
        super(bankName);
    }

    // Implement abstract method
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 5%");
    }
}

// Another concrete subclass
class ICICI extends Bank {
    ICICI(String bankName) {
        super(bankName);
    }

    @Override
    void interestRate() {
        System.out.println("ICICI Interest Rate: 6%");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Abstract class cannot be instantiated
        // Bank b = new Bank("Generic Bank"); // ❌ Not allowed

        // Concrete subclass objects
        Bank sbi = new SBI("SBI Bank");
        Bank icici = new ICICI("ICICI Bank");

        // Polymorphic behavior
        sbi.displayBankName();
        sbi.interestRate();

        icici.displayBankName();
        icici.interestRate();
    }
}
