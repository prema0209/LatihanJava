public class Lagu {
    private String judul;
    private String artis;
    private int durasi; // dalam detik
    
    public Lagu(String judul, String artis, int durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public String getArtis() {
        return artis;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public void setArtis(String artis) {
        this.artis = artis;
    }
    
    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
    // Mengkonversi durasi dari detik ke format mm:ss
    public String getDurasiFormat() {
        int menit = durasi / 60;
        int detik = durasi % 60;
        return String.format("%02d:%02d", menit, detik);
    }
    
    @Override
    public String toString() {
        return "\"" + judul + "\" - " + artis + " (" + getDurasiFormat() + ")";
    }
}