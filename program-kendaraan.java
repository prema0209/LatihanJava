public class Kendaraan {
    // Atribut
    protected String merek;
    protected int tahun;
    protected String warna;
    
    // Constructor
    public Kendaraan(String merek, int tahun, String warna) {
        this.merek = merek;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    // Metode info()
    public void info() {
        System.out.println("Kendaraan:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }
}