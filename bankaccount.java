class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount() {
        this.accountNumber = "0000";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }
    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}
class bankaccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.display();
        BankAccount b2 = new BankAccount("12345", "Jamuna", 5000);
        b2.display();
        b2.deposit(2000);
        b2.display();
    }
}