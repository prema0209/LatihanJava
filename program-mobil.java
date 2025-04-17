public class Mobil extends Kendaraan {
    // Atribut tambahan
    private int jumlahPintu;
    private double kapasitasMesin;
    
    // Constructor
    public Mobil(String merek, int tahun, String warna, int jumlahPintu, double kapasitasMesin) {
        super(merek, tahun, warna);
        this.jumlahPintu = jumlahPintu;
        this.kapasitasMesin = kapasitasMesin;
    }
    
    // Override metode info()
    @Override
    public void info() {
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println();
    }
}