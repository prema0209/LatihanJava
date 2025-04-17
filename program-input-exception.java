import java.util.Scanner;
import java.util.InputMismatchException;

public class InputExceptionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        
        // Lanjutkan meminta input hingga pengguna memasukkan angka yang valid
        while (!validInput) {
            try {
                // Meminta pengguna memasukkan angka
                System.out.print("Masukkan sebuah angka: ");
                number = scanner.nextInt();
                
                // Jika berhasil mencapai titik ini, berarti input valid
                validInput = true;
            } catch (InputMismatchException e) {
                // Menangkap eksepsi jika input bukan angka
                System.out.println("Input tidak valid! Harap masukkan angka.");
                
                // Penting: membersihkan buffer scanner untuk menghindari loop tak terbatas
                scanner.nextLine();
            }
        }
        
        // Menampilkan angka yang valid
        System.out.println("Angka yang Anda masukkan adalah: " + number);
        
        // Menutup scanner
        scanner.close();
    }
}