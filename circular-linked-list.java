public class CircularLinkedList {
    private CNode head;
    private int size;
    
    public CircularLinkedList() {
        head = null;
        size = 0;
    }
    
    // Menambahkan orang ke dalam lingkaran
    public void tambahOrang(Person person) {
        CNode newNode = new CNode(person);
        
        if (head == null) {
            // Lingkaran kosong
            head = newNode;
            head.next = head; // Pointing to itself
        } else {
            // Mencari node terakhir
            CNode current = head;
            while (current.next != head) {
                current = current.next;
            }
            
            // Menambahkan node baru setelah node terakhir
            current.next = newNode;
            newNode.next = head;
        }
        
        size++;
        System.out.println(person.getName() + " (ID: " + person.getId() + ") ditambahkan ke lingkaran.");
    }
    
    // Menghapus orang dari lingkaran berdasarkan ID
    public void hapusOrang(int id) {
        if (head == null) {
            System.out.println("Lingkaran kosong, tidak ada yang dapat dihapus.");
            return;
        }
        
        // Jika hanya ada satu orang dalam lingkaran
        if (head.next == head) {
            if (head.data.getId() == id) {
                System.out.println(head.data.getName() + " (ID: " + id + ") dihapus dari lingkaran.");
                head = null;
                size = 0;
                return;
            } else {
                System.out.println("Orang dengan ID " + id + " tidak ditemukan dalam lingkaran.");
                return;
            }
        }
        
        // Jika orang yang akan dihapus adalah head
        if (head.data.getId() == id) {
            // Mencari node terakhir
            CNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            
            System.out.println(head.data.getName() + " (ID: " + id + ") dihapus dari lingkaran.");
            head = head.next;
            last.next = head;
            size--;
            return;
        }
        
        // Mencari orang yang akan dihapus
        CNode current = head;
        CNode prev = head;
        
        do {
            prev = current;
            current = current.next;
            
            if (current.data.getId() == id) {
                System.out.println(current.data.getName() + " (ID: " + id + ") dihapus dari lingkaran.");
                prev.next = current.next;
                if (current == head) {
                    head = current.next;
                }
                size--;
                return;
            }
        } while (current != head);
        
        System.out.println("Orang dengan ID " + id + " tidak ditemukan dalam lingkaran.");
    }
    
    // Mensimulasikan Josephus Problem
    public Person josephus(int k) {
        if (head == null) {
            System.out.println("Lingkaran kosong, tidak dapat melakukan simulasi.");
            return null;
        }
        
        System.out.println("\n=== SIMULASI JOSEPHUS PROBLEM (k=" + k + ") ===");
        System.out.println("Jumlah orang awal: " + size);
        
        CNode current = head;
        CNode prev = null;
        
        // Mencari node terakhir untuk prev
        prev = head;
        while (prev.next != head) {
            prev = prev.next;
        }
        
        // Melakukan eliminasi hingga hanya tersisa satu orang
        while (size > 1) {
            // Menghitung k orang
            for (int count = 1; count < k; count++) {
                prev = current;
                current = current.next;
            }
            
            // Eliminasi orang ke-k
            System.out.println("Mengeliminasi: " + current.data);
            
            // Jika node yang dieliminasi adalah head
            if (current == head) {
                head = head.next;
            }
            
            prev.next = current.next;
            current = prev.next;
            size--;
        }
        
        // Orang terakhir yang tersisa
        head = current;
        head.next = head; // Memastikan lingkaran tetap circular
        
        System.out.println("\nOrang terakhir yang tersisa: " + head.data);
        System.out.println("=== SIMULASI SELESAI ===\n");
        
        return head.data;
    }
    
    // Menampilkan semua orang dalam lingkaran
    public void tampilkanOrang() {
        if (head == null) {
            System.out.println("Lingkaran kosong, tidak ada orang untuk ditampilkan.");
            return;
        }
        
        System.out.println("\n=== DAFTAR ORANG DALAM LINGKARAN ===");
        
        CNode current = head;
        int count = 1;
        
        do {
            System.out.println(count + ". " + current.data);
            current = current.next;
            count++;
        } while (current != head);
        
        System.out.println("Jumlah orang: " + size);
        System.out.println("===================================\n");
    }
    
    // Mengecek apakah lingkaran kosong
    public boolean isEmpty() {
        return head == null;
    }
    
    // Mendapatkan jumlah orang dalam lingkaran
    public int size() {
        return size;
    }
}