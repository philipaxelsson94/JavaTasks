package ovning3;


public class Account {

    // private fields
    private double balance;
    private final String name;
    private final long accountNr;

    private static double interest = 0.25; // static member, i.e. class data

    // constructors, called when an object/instance is created
    public Account(String name, long accountNr, double balance) {
        this.name = name;
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public Account(String name) {
        this(name, 123456, 0.0 );
    }

    // access methods
    public double getBalance() {
        return balance; // return a copy of the value
    }

    public String getName() {
        return name;
    }

    public long getNumber(){
        return this.accountNr;
    }
    // static methods; can only reference static members
    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double newInterest) {
        interest = newInterest;
    }

    // mutator metods
    public void deposit(double amount) {
        if (amount < 0) {
            // unexpected - terminate excecution
            throw new IllegalArgumentException();
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }

    // other methods
    @Override
    public String toString() {
        String info = "name: " + name + ", number" + accountNr +  ", balance: ";
        info += String.format("%.2f", balance);
        return info;
    }
}
