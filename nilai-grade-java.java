import java.util.Scanner;

public class NilaiGrade {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        // Validasi nilai antara 0-100
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai harus berada antara 0-100");
            input.close();
            return;
        }
        
        // Membagi nilai dengan 10 untuk menyederhanakan kondisi switch
        int nilaiPembagian = nilai / 10;
        
        // Menggunakan switch case untuk menentukan grade
        String grade;
        
        switch (nilaiPembagian) {
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "E";
                break;
        }
        
        // Menampilkan hasil grade
        System.out.println("Grade Anda adalah: " + grade);
        
        // Menutup Scanner
        input.close();
    }
}