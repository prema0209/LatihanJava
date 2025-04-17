public class ElemeTerbesarTerkecil {
    public static void main(String[] args) {
        // Deklarasikan sebuah array 2D dengan ukuran 3x4
        int[][] array2D = {
            {12, 5, 7, 9},
            {23, 15, 8, 19},
            {4, 10, 25, 16}
        };
        
        // Inisialisasi nilai terbesar dan terkecil dengan nilai pertama array
        int terbesar = array2D[0][0];
        int terkecil = array2D[0][0];
        
        // Gunakan nested loop untuk mencari nilai terbesar dan terkecil dalam array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                // Cek apakah nilai saat ini lebih besar dari nilai terbesar
                if (array2D[i][j] > terbesar) {
                    terbesar = array2D[i][j];
                }
                
                // Cek apakah nilai saat ini lebih kecil dari nilai terkecil
                if (array2D[i][j] < terkecil) {
                    terkecil = array2D[i][j];
                }
            }
        }
        
        // Tampilkan hasil
        System.out.println("Nilai terbesar dalam array adalah: " + terbesar);
        System.out.println("Nilai terkecil dalam array adalah: " + terkecil);
    }
}
