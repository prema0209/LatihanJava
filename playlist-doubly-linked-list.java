public class PlaylistDoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int size;
    
    public PlaylistDoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    // Menambahkan lagu di awal playlist
    public void tambahDiAwal(Lagu lagu) {
        DNode newNode = new DNode(lagu);
        
        if (head == null) {
            // Playlist kosong
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
        size++;
        System.out.println("Lagu \"" + lagu.getJudul() + "\" ditambahkan di awal playlist.");
    }
    
    // Menambahkan lagu di akhir playlist
    public void tambahDiAkhir(Lagu lagu) {
        DNode newNode = new DNode(lagu);
        
        if (head == null) {
            // Playlist kosong
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        
        size++;
        System.out.println("Lagu \"" + lagu.getJudul() + "\" ditambahkan di akhir playlist.");
    }
    
    // Menambahkan lagu di posisi tertentu
    public void tambahDiPosisi(Lagu lagu, int posisi) {
        // Validasi posisi
        if (posisi < 0 || posisi > size) {
            System.out.println("Posisi tidak valid. Posisi harus antara 0 dan " + size);
            return;
        }
        
        // Jika posisi 0, tambah di awal
        if (posisi == 0) {
            tambahDiAwal(lagu);
            return;
        }
        
        // Jika posisi = size, tambah di akhir
        if (posisi == size) {
            tambahDiAkhir(lagu);
            return;
        }
        
        // Tambah di tengah
        DNode newNode = new DNode(lagu);
        DNode current = head;
        
        // Navigasi ke posisi
        for (int i = 0; i < posisi - 1; i++) {
            current = current.next;
        }
        
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        
        size++;
        System.out.println("Lagu \"" + lagu.getJudul() + "\" ditambahkan di posisi " + posisi + ".");
    }
    
    // Menghapus lagu berdasarkan judul
    public void hapusLagu(String judul) {
        if (head == null) {
            System.out.println("Playlist kosong, tidak ada lagu yang dapat dihapus.");
            return;
        }
        
        // Jika lagu yang akan dihapus ada di head
        if (head.data.getJudul().equalsIgnoreCase(judul)) {
            head = head.next;
            if (head == null) {
                // Playlist menjadi kosong
                tail = null;
            } else {
                head.prev = null;
            }
            
            size--;
            System.out.println("Lagu \"" + judul + "\" dihapus dari playlist.");
            return;
        }
        
        // Jika lagu yang akan dihapus ada di tail
        if (tail.data.getJudul().equalsIgnoreCase(judul)) {
            tail = tail.prev;
            tail.next = null;
            size--;
            System.out.println("Lagu \"" + judul + "\" dihapus dari playlist.");
            return;
        }
        
        // Mencari lagu di tengah playlist
        DNode current = head.next;
        while (current != null && !current.data.getJudul().equalsIgnoreCase(judul)) {
            current = current.next;
        }
        
        // Jika lagu tidak ditemukan
        if (current == null) {
            System.out.println("Lagu \"" + judul + "\" tidak ditemukan dalam playlist.");
            return;
        }
        
        // Hapus lagu
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Lagu \"" + judul + "\" dihapus dari playlist.");
    }
    
    // Mencari lagu berdasarkan judul
    public Lagu cariLaguByJudul(String judul) {
        DNode current = head;
        
        while (current != null) {
            if (current.data.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu \"" + judul + "\" ditemukan dalam playlist.");
                return current.data;
            }
            current = current.next;
        }
        
        System.out.println("Lagu \"" + judul + "\" tidak ditemukan dalam playlist.");
        return null;
    }
    
    // Mencari lagu berdasarkan artis
    public void cariLaguByArtis(String artis) {
        DNode current = head;
        boolean found = false;
        int count = 0;
        
        System.out.println("\nHasil pencarian lagu dari artis \"" + artis + "\":");
        
        while (current != null) {
            if (current.data.getArtis().equalsIgnoreCase(artis)) {
                count++;
                System.out.println(count + ". " + current.data);
                found = true;
            }
            current = current.next;
        }
        
        if (!found) {
            System.out.println("Tidak ada lagu dari artis \"" + artis + "\" dalam playlist.");
        } else {
            System.out.println("Total: " + count + " lagu.");
        }
    }
    
    // Memutar playlist dari awal ke akhir
    public void putarDariAwal() {
        if (head == null) {
            System.out.println("Playlist kosong, tidak ada lagu untuk diputar.");
            return;
        }
        
        System.out.println("\n=== MEMUTAR PLAYLIST DARI AWAL KE AKHIR ===");
        DNode current = head;
        int track = 1;
        
        while (current != null) {
            System.out.println("Track " + track + ": " + current.data);
            current = current.next;
            track++;
        }
        
        System.out.println("=== SELESAI MEMUTAR PLAYLIST ===\n");
    }
    
    // Memutar playlist dari akhir ke awal
    public void putarDariAkhir() {
        if (tail == null) {
            System.out.println("Playlist kosong, tidak ada lagu untuk diputar.");
            return;
        }
        
        System.out.println("\n=== MEMUTAR PLAYLIST DARI AKHIR KE AWAL ===");
        DNode current = tail;
        int track = size;
        
        while (current != null) {
            System.out.println("Track " + track + ": " + current.data);
            current = current.prev;
            track--;
        }
        
        System.out.println("=== SELESAI MEMUTAR PLAYLIST ===\n");
    }
    
    // Menghitung total durasi playlist
    public int hitungTotalDurasi() {
        int totalDurasi = 0;
        DNode current = head;
        
        while (current != null) {
            totalDurasi += current.data.getDurasi();
            current = current.next;
        }
        
        return totalDurasi;
    }
    
    // Mendapatkan format durasi total (hh:mm:ss)
    public String getTotalDurasiFormat() {
        int totalDetik = hitungTotalDurasi();
        int jam = totalDetik / 3600;
        int menit = (totalDetik % 3600) / 60;
        int detik = totalDetik % 60;
        
        if (jam > 0) {
            return String.format("%d:%02d:%02d", jam, menit, detik);
        } else {
            return String.format("%02d:%02d", menit, detik);
        }
    }
    
    // Menampilkan seluruh playlist
    public void tampilkanPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong, tidak ada lagu untuk ditampilkan.");
            return;
        }
        
        System.out.println("\n=== DAFTAR LAGU DALAM PLAYLIST ===");
        DNode current = head;
        int track = 1;
        
        while (current != null) {
            System.out.println("Track " + track + ": " + current.data);
            current = current.next;
            track++;
        }
        
        System.out.println("Total lagu: " + size);
        System.out.println("Total durasi: " + getTotalDurasiFormat());
        System.out.println("===================================\n");
    }
}