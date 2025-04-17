public class Mahasiswa {
    // Atribut private
    private String nim;
    private String nama;
    private int umur;
    private double ipk;
    
    // Constructor
    public Mahasiswa(String nim, String nama, int umur, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    // Accessor (Getter)
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public double getIpk() {
        return ipk;
    }
    
    // Mutator (Setter)
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    // Metode tampilkanInfo()
    public void tampilkanInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + cekStatus());
        System.out.println();
    }
    
    // Metode cekStatus()
    public String cekStatus() {
        if (ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}
