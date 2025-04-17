public class FactorialCalculator {
    public static void main(String[] args) {
        int num = 5; // (1) Mengisi nilai 5 sesuai dengan soal
        double factorial = 1.0; // (2) Menggunakan double agar sesuai dengan output yang diharapkan
        for (int i = 1; i <= num; i++) { // (3) Kondisi loop sampai i <= num
            factorial = factorial * i;  // (4) Mengalikan factorial dengan i
        }
        System.out.println("The factorial of " 
            + num + " is: " + factorial); // (5) Menampilkan hasil
    }
}