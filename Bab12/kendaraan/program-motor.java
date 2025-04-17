public class Motor extends Kendaraan {
    // Atribut tambahan
    private String tipeMesin;
    
    // Constructor
    public Motor(String merek, int tahun, String warna, String tipeMesin) {
        super(merek, tahun, warna);
        this.tipeMesin = tipeMesin;
    }
    
    // Override metode info()
    @Override
    public void info() {
        System.out.println("=== INFORMASI MOTOR ===");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe Mesin: " + tipeMesin);
        System.out.println();
    }
}
