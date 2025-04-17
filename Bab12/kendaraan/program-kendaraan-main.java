public class MainKendaraan {
    public static void main(String[] args) {
        // Demonstrasi polymorphism dengan array bertipe Kendaraan
        Kendaraan[] kendaraanArray = new Kendaraan[4];
        
        // Mengisi array dengan objek Mobil dan Motor
        kendaraanArray[0] = new Mobil("Toyota", 2020, "Hitam", 4, 1500.0);
        kendaraanArray[1] = new Mobil("Honda", 2021, "Merah", 2, 1200.0);
        kendaraanArray[2] = new Motor("Yamaha", 2019, "Biru", "4-Tak");
        kendaraanArray[3] = new Motor("Suzuki", 2022, "Putih", "2-Tak");
        
        // Memanggil metode info() untuk setiap objek dalam array
        System.out.println("=== DEMONSTRASI POLYMORPHISM ===");
        for (Kendaraan k : kendaraanArray) {
            k.info();
        }
    }
}
