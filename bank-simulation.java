import java.util.ArrayList;

public class BankSimulation {
    public static void main(String[] args) {
        // Membuat objek BankQueue
        BankQueue bankQueue = new BankQueue();
        
        // Membuat daftar untuk menyimpan waktu tunggu setiap pelanggan
        ArrayList<Integer> waitingTimes = new ArrayList<>();
        
        System.out.println("=== SIMULASI ANTRIAN PELAYANAN BANK ===\n");
        
        // Menambahkan beberapa pelanggan ke antrian
        Customer customer1 = new Customer(1, "Budi", 3);
        Customer customer2 = new Customer(2, "Siti", 5);
        Customer customer3 = new Customer(3, "Ahmad", 2);
        Customer customer4 = new Customer(4, "Dewi", 7);
        Customer customer5 = new Customer(5, "Eko", 4);
        
        System.out.println("Pelanggan masuk ke antrian:");
        
        bankQueue.enqueue(customer1);
        System.out.println("- " + customer1);
        
        bankQueue.enqueue(customer2);
        System.out.println("- " + customer2);
        
        bankQueue.enqueue(customer3);
        System.out.println("- " + customer3);
        
        bankQueue.enqueue(customer4);
        System.out.println("- " + customer4);
        
        bankQueue.enqueue(customer5);
        System.out.println("- " + customer5);
        
        System.out.println("\nStatus antrian awal:");
        bankQueue.displayQueue();
        
        // Simulasi pelayanan
        System.out.println("=== MULAI SIMULASI PELAYANAN ===\n");
        
        int currentTime = 0;
        int totalWaitingTime = 0;
        
        while (!bankQueue.isEmpty()) {
            Customer currentCustomer = bankQueue.dequeue();
            
            // Hitung waktu tunggu pelanggan saat ini
            int waitingTime = currentTime;
            totalWaitingTime += waitingTime;
            waitingTimes.add(waitingTime);
            
            System.out.println("Waktu: " + currentTime + " menit - Melayani: " + currentCustomer);
            System.out.println("Waktu tunggu " + currentCustomer.getName() + ": " + waitingTime + " menit");
            
            // Tambahkan waktu transaksi ke waktu saat ini
            currentTime += currentCustomer.getTransactionTime();
            
            System.out.println("Transaksi selesai pada waktu: " + currentTime + " menit");
            
            // Tampilkan status antrian setelah pelanggan dilayani
            System.out.println("\nStatus antrian:");
            bankQueue.displayQueue();
        }
        
        // Menghitung dan menampilkan total waktu tunggu rata-rata
        double averageWaitingTime = (double) totalWaitingTime / waitingTimes.size();
        
        System.out.println("=== HASIL SIMULASI ===");
        System.out.println("Total waktu simulasi: " + currentTime + " menit");
        System.out.println("Semua pelanggan telah dilayani");
        System.out.println("Waktu tunggu rata-rata: " + String.format("%.2f", averageWaitingTime) + " menit");
        
        // Menampilkan waktu tunggu setiap pelanggan
        System.out.println("\nDetail waktu tunggu:");
        for (int i = 0; i < waitingTimes.size(); i++) {
            System.out.println("Pelanggan #" + (i+1) + ": " + waitingTimes.get(i) + " menit");
        }
    }
}