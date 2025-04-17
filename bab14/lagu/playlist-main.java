public class PlaylistMain {
    public static void main(String[] args) {
        // Membuat objek PlaylistDoublyLinkedList
        PlaylistDoublyLinkedList playlist = new PlaylistDoublyLinkedList();
        
        System.out.println("=== IMPLEMENTASI DOUBLY LINKED LIST - PLAYLIST LAGU ===\n");
        
        // Menampilkan playlist saat masih kosong
        playlist.tampilkanPlaylist();
        
        // Menambahkan beberapa lagu di awal playlist
        playlist.tambahDiAwal(new Lagu("Shape of You", "Ed Sheeran", 235));
        playlist.tambahDiAwal(new Lagu("Bohemian Rhapsody", "Queen", 354));
        
        // Menampilkan playlist
        playlist.tampilkanPlaylist();
        
        // Menambahkan beberapa lagu di akhir playlist
        playlist.tambahDiAkhir(new Lagu("Uptown Funk", "Mark Ronson ft. Bruno Mars", 270));
        playlist.tambahDiAkhir(new Lagu("Billie Jean", "Michael Jackson", 294));
        
        // Menambahkan lagu di posisi tertentu
        playlist.tambahDiPosisi(new Lagu("Thinking Out Loud", "Ed Sheeran", 282), 2);
        
        // Menampilkan playlist
        playlist.tampilkanPlaylist();
        
        // Mencari lagu berdasarkan judul
        System.out.println("Mencari lagu 'Billie Jean':");
        Lagu lagu = playlist.cariLaguByJudul("Billie Jean");
        if (lagu != null) {
            System.out.println("Hasil pencarian: " + lagu + "\n");
        }
        
        System.out.println("Mencari lagu 'Despacito':");
        playlist.cariLaguByJudul("Despacito");
        
        // Mencari lagu berdasarkan artis
        playlist.cariLaguByArtis("Ed Sheeran");
        
        // Menghapus lagu berdasarkan judul
        playlist.hapusLagu("Bohemian Rhapsody");
        
        // Menampilkan playlist setelah penghapusan
        playlist.tampilkanPlaylist();
        
        // Memutar playlist dari awal ke akhir
        playlist.putarDariAwal();
        
        // Memutar playlist dari akhir ke awal
        playlist.putarDariAkhir();
        
        // Menambahkan beberapa lagu lagi
        playlist.tambahDiAkhir(new Lagu("Perfect", "Ed Sheeran", 263));
        playlist.tambahDiAkhir(new Lagu("Thriller", "Michael Jackson", 357));
        
        // Menampilkan playlist final
        playlist.tampilkanPlaylist();
        
        // Mencari lagu dari artis tertentu
        playlist.cariLaguByArtis("Michael Jackson");
    }
}
