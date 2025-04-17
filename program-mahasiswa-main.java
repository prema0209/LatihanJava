public class MainMahasiswa {
    public static void main(String[] args) {
        // Instansiasi beberapa objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("2021001", "Budi Santoso", 20, 3.75);
        Mahasiswa mhs2 = new Mahasiswa("2021002", "Siti Rahayu", 19, 2.50);
        Mahasiswa mhs3 = new Mahasiswa("2021003", "Ahmad Dhani", 21, 3.25);
        
        // Memanggil metode pada objek Mahasiswa
        System.out.println("=== INFORMASI MAHASISWA ===");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        
        // Mengubah nilai IPK mahasiswa kedua dan menampilkan informasi lagi
        System.out.println("=== SETELAH PERUBAHAN IPK ===");
        mhs2.setIpk(2.80);
        mhs2.tampilkanInfo();
    }
}