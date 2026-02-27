class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

class withdraw {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Jamuna", 1000);
        try {
            b.withdraw(1500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}