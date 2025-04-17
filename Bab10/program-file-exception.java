import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionHandler {
    
    // Metode untuk membaca file dengan penanganan eksepsi
    public static void readFile(String filename) {
        BufferedReader reader = null;
        
        try {
            // Mencoba membuka dan membaca file
            reader = new BufferedReader(new FileReader(filename));
            String line;
            
            System.out.println("Membaca isi file " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            // Menangkap eksepsi jika file tidak ditemukan
            System.out.println("Error: File " + filename + " tidak ditemukan.");
            
        } catch (IOException e) {
            // Menangkap eksepsi I/O lainnya
            System.out.println("Error: Terjadi kesalahan saat membaca file " + filename);
            System.out.println("Detail error: " + e.getMessage());
            
        } finally {
            // Blok finally akan selalu dieksekusi, digunakan untuk menutup file
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File berhasil ditutup.");
                }
            } catch (IOException e) {
                System.out.println("Error: Gagal menutup file.");
            }
        }
    }
    
    public static void main(String[] args) {
        // Mencoba membaca file yang ada (ganti dengan nama file yang ada di sistem Anda)
        System.out.println("=== Percobaan 1: Membaca file yang ada ===");
        readFile("data.txt");
        
        System.out.println("\n=== Percobaan 2: Membaca file yang tidak ada ===");
        readFile("file_yang_tidak_ada.txt");
    }
}
