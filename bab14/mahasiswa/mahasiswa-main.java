public class MahasiswaMain {
    public static void main(String[] args) {
        // Membuat objek MahasiswaLinkedList
        MahasiswaLinkedList list = new MahasiswaLinkedList();
        
        System.out.println("=== IMPLEMENTASI SINGLY LINKED LIST - DAFTAR MAHASISWA ===\n");
        
        // Menampilkan daftar saat masih kosong
        list.tampilkanDaftar();
        
        // Menambahkan beberapa mahasiswa di awal list
        list.tambahDiAwal(new Mahasiswa("2023001", "Budi Santoso", 3.75));
        list.tambahDiAwal(new Mahasiswa("2023002", "Siti Rahayu", 3.90));
        
        // Menampilkan daftar mahasiswa
        list.tampilkanDaftar();
        
        // Menambahkan beberapa mahasiswa di akhir list
        list.tambahDiAkhir(new Mahasiswa("2023003", "Ahmad Dhani", 3.60));
        list.tambahDiAkhir(new Mahasiswa("2023004", "Dewi Lestari", 3.85));
        
        // Menampilkan daftar mahasiswa
        list.tampilkanDaftar();
        
        // Mencari mahasiswa berdasarkan NIM
        System.out.println("Mencari mahasiswa dengan NIM 2023002:");
        Mahasiswa mhs = list.cariMahasiswa("2023002");
        if (mhs != null) {
            System.out.println("Hasil pencarian: " + mhs + "\n");
        }
        
        System.out.println("Mencari mahasiswa dengan NIM 2023999:");
        list.cariMahasiswa("2023999");
        System.out.println();
        
        // Menghapus mahasiswa berdasarkan NIM
        list.hapusMahasiswa("2023002");
        
        // Menampilkan daftar setelah penghapusan
        list.tampilkanDaftar();
        
        // Menghapus mahasiswa yang tidak ada
        list.hapusMahasiswa("2023999");
        
        // Menghapus mahasiswa di awal list
        list.hapusMahasiswa("2023001");
        
        // Menampilkan daftar setelah penghapusan
        list.tampilkanDaftar();
        
        // Menambahkan mahasiswa lagi
        list.tambahDiAwal(new Mahasiswa("2023005", "Eko Pratama", 3.45));
        
        // Menampilkan daftar final
        list.tampilkanDaftar();
    }
}
