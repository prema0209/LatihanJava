import java.util.ArrayList;

public class GabungArrayList {
    public static void main(String[] args) {
        // Buat dua ArrayList dengan nama buah1 dan buah2
        ArrayList<String> buah1 = new ArrayList<>();
        ArrayList<String> buah2 = new ArrayList<>();
        
        // Tambahkan beberapa jenis buah ke ArrayList buah1
        buah1.add("Apel");
        buah1.add("Jeruk");
        buah1.add("Mangga");
        
        // Tambahkan beberapa jenis buah ke ArrayList buah2
        buah2.add("Anggur");
        buah2.add("Pisang");
        buah2.add("Melon");
        
        // Buat ArrayList baru bernama buahGabungan
        ArrayList<String> buahGabungan = new ArrayList<>();
        
        // Tambahkan semua elemen dari buah1 ke buahGabungan
        buahGabungan.addAll(buah1);
        
        // Tambahkan semua elemen dari buah2 ke buahGabungan
        buahGabungan.addAll(buah2);
        
        // Tampilkan isi ketiga ArrayList
        System.out.println("Isi ArrayList buah1: " + buah1);
        System.out.println("Isi ArrayList buah2: " + buah2);
        System.out.println("Isi ArrayList buahGabungan: " + buahGabungan);
    }
}