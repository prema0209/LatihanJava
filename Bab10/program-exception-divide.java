public class DivideExceptionHandler {
    
    // Metode untuk melakukan pembagian dengan penanganan eksepsi
    public static int divide(int numerator, int denominator) {
        try {
            // Mencoba melakukan pembagian
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Menangkap eksepsi saat pembagian dengan nol
            System.out.println("Pembagian dengan nol tidak diperbolehkan!");
            return 0; // Mengembalikan nilai 0 jika terjadi eksepsi
        }
    }
    
    public static void main(String[] args) {
        // Demonstrasi penggunaan metode divide dengan beberapa contoh
        System.out.println("10 / 2 = " + divide(10, 2));
        System.out.println("8 / 4 = " + divide(8, 4));
        System.out.println("5 / 0 = " + divide(5, 0)); // Contoh pembagian dengan nol
        System.out.println("20 / 5 = " + divide(20, 5));
    }
}
