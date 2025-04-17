import java.util.Arrays;
import java.util.Random;

public class HeapMain {
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTASI MAX HEAP DAN HEAP SORT ===\n");
        
        // Membuat objek MaxHeap
        MaxHeap maxHeap = new MaxHeap(10);
        
        // Menambahkan beberapa elemen ke dalam heap
        System.out.println("Menambahkan elemen: 15, 10, 30, 5, 25, 40, 35");
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(30);
        maxHeap.insert(5);
        maxHeap.insert(25);
        maxHeap.insert(40);
        maxHeap.insert(35);
        
        // Menampilkan heap
        System.out.println("\nHeap setelah insert:");
        maxHeap.printHeap();
        
        // Mengekstrak nilai maksimum
        System.out.println("\nEkstrak nilai maksimum: " + maxHeap.extractMax());
        
        // Menampilkan heap setelah ekstraksi
        System.out.println("Heap setelah ekstraksi nilai maksimum:");
        maxHeap.printHeap();
        
        // Membuat max heap dari array
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("\nMembuat max heap dari array: " + Arrays.toString(arr));
        maxHeap.heapify(arr);
        
        // Menampilkan heap
        System.out.println("Heap setelah heapify:");
        maxHeap.printHeap();
        
        // Mengekstrak semua elemen dari heap untuk melihat urutan
        System.out.println("\nMengekstrak semua elemen dari heap (seharusnya dalam urutan menurun):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.extractMax() + " ");
        }
        System.out.println();
        
        // Demonstrasi heap sort
        System.out.println("\n=== DEMONSTRASI HEAP SORT ===\n");
        
        // Array untuk diurutkan
        int[] arrayToSort = {15, 10, 30, 5, 25, 40, 35};
        System.out.println("Array sebelum sorting: " + Arrays.toString(arrayToSort));
        
        // Sorting menggunakan Heap Sort
        MaxHeap.heapSort(arrayToSort);
        System.out.println("Array setelah Heap Sort: " + Arrays.toString(arrayToSort));
        
        // Membandingkan waktu eksekusi Heap Sort dan Bubble Sort
        System.out.println("\n=== PERBANDINGAN WAKTU EKSEKUSI HEAP SORT VS BUBBLE SORT ===\n");
        
        // Membuat array besar dengan nilai random
        int size = 10000;
        int[] largeArray1 = generateRandomArray(size);
        int[] largeArray2 = Arrays.copyOf(largeArray1, largeArray1.length);
        
        // Waktu eksekusi Heap Sort
        long startTime = System.nanoTime();
        MaxHeap.heapSort(largeArray1);
        long endTime = System.nanoTime();
        long heapSortDuration = (endTime - startTime) / 1000000; // dalam milidetik
        
        // Waktu eksekusi Bubble Sort
        startTime = System.nanoTime();
        MaxHeap.bubbleSort(largeArray2);
        endTime = System.nanoTime();
        long bubbleSortDuration = (endTime - startTime) / 1000000; // dalam milidetik
        
        System.out.println("Waktu eksekusi Heap Sort untuk array ukuran " + size + ": " + heapSortDuration + " ms");
        System.out.println("Waktu eksekusi Bubble Sort untuk array ukuran " + size + ": " + bubbleSortDuration + " ms");
        System.out.println("Heap Sort " + (bubbleSortDuration / heapSortDuration) + " kali lebih cepat dari Bubble Sort");
    }
    
    // Helper method untuk membuat array dengan nilai random
    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }
        
        return arr;
    }
}
        