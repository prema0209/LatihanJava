public class DynamicStackMain {
    public static void main(String[] args) {
        // Membuat objek DynamicStack
        DynamicStack stack = new DynamicStack();
        
        System.out.println("=== DEMONSTRASI DYNAMIC STACK ===");
        
        // Memeriksa apakah stack kosong
        System.out.println("Stack kosong: " + stack.isEmpty());
        
        // Menambahkan beberapa string ke stack
        System.out.println("\nMenambahkan elemen ke stack:");
        stack.push("Java");
        System.out.println("Push: Java");
        stack.push("Python");
        System.out.println("Push: Python");
        stack.push("C++");
        System.out.println("Push: C++");
        stack.push("JavaScript");
        System.out.println("Push: JavaScript");
        stack.push("PHP");
        System.out.println("Push: PHP");
        
        // Menampilkan ukuran stack
        System.out.println("\nUkuran stack setelah push: " + stack.size());
        
        // Melihat elemen teratas
        System.out.println("Elemen teratas: " + stack.peek());
        
        // Mengeluarkan elemen dari stack
        System.out.println("\nMengeluarkan elemen dari stack:");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        
        // Melihat elemen teratas setelah pop
        System.out.println("\nElemen teratas setelah pop: " + stack.peek());
        
        // Menampilkan ukuran stack setelah pop
        System.out.println("Ukuran stack setelah pop: " + stack.size());
        
        // Menampilkan isi stack
        System.out.println("\nIsi stack saat ini: " + stack);
        
        // Mengeluarkan semua elemen yang tersisa
        System.out.println("\nMengeluarkan semua elemen yang tersisa:");
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
        
        // Memeriksa apakah stack kosong setelah semua elemen dikeluarkan
        System.out.println("\nStack kosong: " + stack.isEmpty());
    }
}
