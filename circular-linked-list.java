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
        CNode prev = null;
        
        