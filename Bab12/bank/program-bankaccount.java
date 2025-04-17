public class BankAccount {
    // Atribut private
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    // Atribut static
    private static int totalAccounts = 0;
    
    // Constructor
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        totalAccounts++; // Menambah jumlah akun setiap kali objek baru dibuat
    }
    
    // Metode deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit berhasil. Saldo saat ini: " + balance);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0");
        }
    }
    
    // Metode withdraw
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
            return false;
        } else if (amount > balance) {
            System.out.println("Saldo tidak mencukupi. Saldo saat ini: " + balance);
            return false;
        } else {
            balance -= amount;
            System.out.println("Penarikan berhasil. Saldo saat ini: " + balance);
            return true;
        }
    }
    
    // Metode static untuk mendapatkan jumlah akun
    public static int getAccountCount() {
        return totalAccounts;
    }
    
    // Metode checkBalance
    public double checkBalance() {
        return balance;
    }
    
    // Metode untuk menampilkan informasi akun
    public void displayInfo() {
        System.out.println("Nomor Akun: " + accountNumber);
        System.out.println("Nama Pemilik: " + ownerName);
        System.out.println("Saldo: " + balance);
        System.out.println();
    }
}
