public class PalindromeChecker {
    
    // Metode untuk mengecek apakah string adalah palindrom menggunakan stack
    public static boolean isPalindrome(String str) {
        // Membuat objek DynamicStack baru
        DynamicStack stack = new DynamicStack();
        
        // Menghapus semua spasi dan mengubah ke huruf kecil untuk pengecekkan yang lebih akurat
        str = str.toLowerCase().replaceAll("\\s+", "");
        
        // Memasukkan semua karakter string ke dalam stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(String.valueOf(str.charAt(i)));
        }
        
        // Membandingkan karakter yang diambil dari stack (karakter terakhir)
        // dengan karakter asli (karakter pertama)
        for (int i = 0; i < str.length(); i++) {
            if (!stack.pop().equals(String.valueOf(str.charAt(i)))) {
                return false;
            }
        }
        
        // Jika semua karakter cocok, maka string adalah palindrom
        return true;
    }
    
    public static void main(String[] args) {
        // Contoh string untuk di-test
        String[] testStrings = {
            "radar",
            "level",
            "kayak",
            "madam",
            "racecar",
            "hello",
            "world",
            "java",
            "A man a plan a canal Panama", // palindrom dengan spasi
            "Was it a car or a cat I saw",  // palindrom dengan spasi
            "No lemon no melon"             // palindrom dengan spasi
        };
        
        System.out.println("=== PENGECEKAN PALINDROM MENGGUNAKAN STACK ===\n");
        
        // Memeriksa setiap string dan menampilkan hasilnya
        for (String str : testStrings) {
            boolean result = isPalindrome(str);
            System.out.println("String '" + str + "' adalah palindrom: " + result);
        }
    }
}