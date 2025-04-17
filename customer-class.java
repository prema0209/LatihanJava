public class Customer {
    private int id;
    private String name;
    private int transactionTime; // dalam menit
    
    // Constructor
    public Customer(int id, String name, int transactionTime) {
        this.id = id;
        this.name = name;
        this.transactionTime = transactionTime;
    }
    
    // Getter methods
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTransactionTime() {
        return transactionTime;
    }
    
    // toString method untuk menampilkan informasi pelanggan
    @Override
    public String toString() {
        return "Customer #" + id + " - " + name + " (Waktu transaksi: " + transactionTime + " menit)";
    }
}