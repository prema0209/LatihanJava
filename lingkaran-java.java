public class HitungLingkaran {
    public static void main(String[] args) {
        // 1. Deklarasikan variabel double bernama radius dan inisialisasi dengan nilai 7.5
        double radius = 7.5;
        
        // 2. Hitung luas dan keliling lingkaran dengan rumus yang diberikan
        // 3. Gunakan nilai π sebesar 3.14159
        final double PI = 3.14159;
        
        // 4. Simpan hasil luas dan keliling dalam variabel double bernama luas dan keliling
        double luas = PI * radius * radius;
        double keliling = 2 * PI * radius;
        
        // 5. Tampilkan hasilnya dalam format yang diminta
        System.out.println("Radius lingkaran: " + radius);
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}