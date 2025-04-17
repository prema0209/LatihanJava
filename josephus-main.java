public class JosephusMain {
    public static void main(String[] args) {
        // Membuat objek CircularLinkedList
        CircularLinkedList circle = new CircularLinkedList();
        
        System.out.println("=== IMPLEMENTASI CIRCULAR LINKED LIST - JOSEPHUS PROBLEM ===\n");
        
        // Menambahkan beberapa orang ke dalam lingkaran
        circle.tambahOrang(new Person(1, "Alice"));
        circle.tambahOrang(new Person(2, "Bob"));
        circle.tambahOrang(new Person(3, "Charlie"));
        circle.tambahOrang(new Person(4, "David"));
        circle.tambahOrang(new Person(5, "Eva"));
        circle.tambahOrang(new Person(6, "Frank"));
        circle.tambahOrang(new Person(7, "Grace"));
        
        // Menampilkan semua orang dalam lingkaran
        circle.tampilkanOrang();
        
        // Simulasi Josephus Problem dengan k=3
        System.out.println("Simulasi Josephus Problem dengan k=3:");
        Person survivor1 = circle.josephus(3);
        
        // Membuat lingkaran baru untuk simulasi kedua
        CircularLinkedList circle2 = new CircularLinkedList();
        
        // Menambahkan orang ke lingkaran kedua
        for (int i = 1; i <= 10; i++) {
            circle2.tambahOrang(new Person(i, "Person " + i));
        }
        
        // Menampilkan semua orang dalam lingkaran kedua
        circle2.tampilkanOrang();
        
        // Simulasi Josephus Problem dengan k=2
        System.out.println("Simulasi Josephus Problem dengan k=2:");
        Person survivor2 = circle2.josephus(2);
        
        // Menampilkan hasil final dari kedua simulasi
        System.out.println("Hasil simulasi 1 (n=7, k=3): " + survivor1.getName() + " adalah orang terakhir yang tersisa.");
        System.out.println("Hasil simulasi 2 (n=10, k=2): " + survivor2.getName() + " adalah orang terakhir yang tersisa.");
    }
}