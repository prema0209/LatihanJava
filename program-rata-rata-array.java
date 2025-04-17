public class RataRataArray {
    public static void main(String[] args) {
        // Deklarasikan sebuah array int untuk menyimpan 6 nilai integer
        int[] nilai = {78, 65, 92, 81, 76, 88};
        
        // Hitung rata-rata dari semua nilai dalam array menggunakan loop
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        
        // Hitung rata-rata
        double rataRata = (double) total / nilai.length;
        
        // Tampilkan nilai dalam array
        System.out.print("Nilai dalam array: [");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]);
            if (i < nilai.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Tampilkan hasil rata-rata
        System.out.println("Rata-rata: " + rataRata);
    }
}