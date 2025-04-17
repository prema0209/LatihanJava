public class MainBankAccount {
    public static void main(String[] args) {
        // Membuat beberapa objek BankAccount
        BankAccount account1 = new BankAccount("123456", "John Doe");
        BankAccount account2 = new BankAccount("789012", "Jane Smith");
        BankAccount account3 = new BankAccount("345678", "Bob Johnson");
        
        System.out.println("=== INFORMASI AWAL AKUN ===");
        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();
        
        // Melakukan operasi deposit dan withdraw
        System.out.println("=== OPERASI DEPOSIT DAN WITHDRAW ===");
        account1.deposit(1000);
        account1.withdraw(300);
        account1.withdraw(800); // Mencoba menarik lebih dari saldo
        
        account2.deposit(5000);
        account2.withdraw(1500);
        
        account3.deposit(750);
        account3.withdraw(250);
        
        // Menampilkan informasi akun setelah operasi
        System.out.println("\n=== INFORMASI AKUN SETELAH OPERASI ===");
        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();
        
        // Menampilkan total akun yang telah dibuat menggunakan metode static
        System.out.println("=== INFORMASI TOTAL AKUN ===");
        System.out.println("Total akun yang telah dibuat: " + BankAccount.getAccountCount());
    }
}