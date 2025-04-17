import java.util.Scanner;

public class KategoriUmur {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan umur
        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();
        
        // Menggunakan struktur if-else-if untuk menentukan kategori umur
        String kategori;
        
        if (umur < 13) {
            kategori = "Anak-anak";
        } else if (umur >= 13 && umur <= 17) {
            kategori = "Remaja";
        } else if (umur >= 18 && umur <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }
        
        // Menampilkan hasil kategori umur
        System.out.println("Kategori umur Anda adalah: " + kategori);
        
        // Menutup Scanner
        input.close();
    }
}
