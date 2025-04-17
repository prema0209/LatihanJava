import java.util.LinkedList;

public class BankQueue {
    private LinkedList<Customer> queue;
    
    // Constructor
    public BankQueue() {
        queue = new LinkedList<>();
    }
    
    // Menambahkan pelanggan ke antrian
    public void enqueue(Customer customer) {
        queue.addLast(customer);
    }
    
    // Menghapus dan mengembalikan pelanggan dari bagian depan antrian
    public Customer dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Antrian kosong, tidak dapat melakukan dequeue");
        }
        return queue.removeFirst();
    }
    
    // Mengembalikan pelanggan di bagian depan tanpa menghapusnya
    public Customer peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Antrian kosong, tidak dapat melakukan peek");
        }
        return queue.getFirst();
    }
    
    // Memeriksa apakah antrian kosong
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // Mengembalikan jumlah pelanggan dalam antrian
    public int size() {
        return queue.size();
    }
    
    // Menampilkan semua pelanggan dalam antrian
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        
        System.out.println("Status Antrian (total " + size() + " pelanggan):");
        int position = 1;
        for (Customer customer : queue) {
            System.out.println(position + ". " + customer);
            position++;
        }
        System.out.println();
    }
}
