import java.util.Scanner;

public class HitungVokal {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan kalimat
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();
        
        // Mengubah kalimat menjadi huruf kecil agar tidak perlu mengecek huruf besar dan kecil terpisah
        kalimat = kalimat.toLowerCase();
        
        // Variabel untuk menyimpan jumlah huruf vokal
        int jumlahVokal = 0;
        
        // Mengecek setiap karakter dalam kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            
            // Mengecek apakah karakter tersebut adalah huruf vokal
            if (karakter == 'a' || karakter == 'e' || karakter == 'i' || 
                karakter == 'o' || karakter == 'u') {
                jumlahVokal++;
            }
        }
        
        // Menampilkan hasil
        System.out.println("Jumlah huruf vokal dalam kalimat adalah: " + jumlahVokal);
        
        // Menutup Scanner
        input.close();
    }
}