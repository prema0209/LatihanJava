public class MahasiswaLinkedList {
    private Node head;
    
    public MahasiswaLinkedList() {
        this.head = null;
    }
    
    // Menambahkan mahasiswa di awal list
    public void tambahDiAwal(Mahasiswa mhs) {
        Node newNode = new Node(mhs);
        newNode.next = head;
        head = newNode;
        System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan di awal list.");
    }
    
    // Menambahkan mahasiswa di akhir list
    public void tambahDiAkhir(Mahasiswa mhs) {
        Node newNode = new Node(mhs);
        
        // Jika list kosong, jadikan node baru sebagai head
        if (head == null) {
            head = newNode;
            System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan di akhir list (list kosong).");
            return;
        }
        
        // Mencari node terakhir
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        // Menambahkan node baru setelah node terakhir
        current.next = newNode;
        System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan di akhir list.");
    }
    
    // Menghapus mahasiswa berdasarkan NIM
    public void hapusMahasiswa(String nim) {
        // Jika list kosong
        if (head == null) {
            System.out.println("List kosong, tidak ada yang dapat dihapus.");
            return;
        }
        
        // Jika mahasiswa yang akan dihapus adalah head
        if (head.data.getNim().equals(nim)) {
            System.out.println("Mahasiswa " + head.data.getNama() + " dengan NIM " + nim + " dihapus.");
            head = head.next;
            return;
        }
        
        // Mencari mahasiswa yang akan dihapus
        Node current = head;
        Node prev = null;
        
        while (current != null && !current.data.getNim().equals(nim)) {
            prev = current;
            current = current.next;
        }
        
        // Jika mahasiswa tidak ditemukan
        if (current == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }
        
        // Menghapus mahasiswa
        prev.next = current.next;
        System.out.println("Mahasiswa " + current.data.getNama() + " dengan NIM " + nim + " dihapus.");
    }
    
    // Mencari mahasiswa berdasarkan NIM
    public Mahasiswa cariMahasiswa(String nim) {
        Node current = head;
        
        while (current != null) {
            if (current.data.getNim().equals(nim)) {
                System.out.println("Mahasiswa dengan NIM " + nim + " ditemukan.");
                return current.data;
            }
            current = current.next;
        }
        
        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        return null;
    }
    
    // Menampilkan seluruh daftar mahasiswa
    public void tampilkanDaftar() {
        if (head == null) {
            System.out.println("List kosong, tidak ada mahasiswa untuk ditampilkan.");
            return;
        }
        
        System.out.println("\n=== DAFTAR MAHASISWA ===");
        Node current = head;
        int count = 1;
        
        while (current != null) {
            System.out.println(count + ". " + current.data);
            current = current.next;
            count++;
        }
        System.out.println("=========================\n");
    }
}