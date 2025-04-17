public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;
    
    // Constructor
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }
    
    // Mendapatkan index parent dari node i
    private int parent(int i) {
        return (i - 1) / 2;
    }
    
    // Mendapatkan index left child dari node i
    private int leftChild(int i) {
        return 2 * i + 1;
    }
    
    // Mendapatkan index right child dari node i
    private int rightChild(int i) {
        return 2 * i + 2;
    }
    
    // Menukar dua elemen dalam heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    // Menyesuaikan posisi node ke atas setelah insert
    private void heapifyUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }
    
    // Menyesuaikan posisi node ke bawah
    private void heapifyDown(int i) {
        int maxIndex = i;
        int left = leftChild(i);
        int right = rightChild(i);
        
        // Jika left child lebih besar dari current
        if (left < size && heap[left] > heap[maxIndex]) {
            maxIndex = left;
        }
        
        // Jika right child lebih besar dari current dan left
        if (right < size && heap[right] > heap[maxIndex]) {
            maxIndex = right;
        }
        
        // Jika salah satu child lebih besar
        if (i != maxIndex) {
            swap(i, maxIndex);
            heapifyDown(maxIndex);
        }
    }
    
    // Menambahkan nilai baru ke heap
    public void insert(int value) {
        if (size == capacity) {
            // Perbesar kapasitas jika heap penuh
            int[] newHeap = new int[capacity * 2];
            System.arraycopy(heap, 0, newHeap, 0, capacity);
            heap = newHeap;
            capacity = capacity * 2;
        }
        
        // Tambahkan elemen di posisi terakhir
        heap[size] = value;
        size++;
        
        // Heapify up untuk mempertahankan properti max heap
        heapifyUp(size - 1);
    }
    
    // Menghapus dan mengembalikan nilai maksimum (root)
    public int extractMax() {
        if (size <= 0) {
            throw new IllegalStateException("Heap kosong");
        }
        
        int max = heap[0];
        
        // Ganti root dengan elemen terakhir
        heap[0] = heap[size - 1];
        size--;
        
        // Heapify down untuk mempertahankan properti max heap
        heapifyDown(0);
        
        return max;
    }
    
    // Membuat max heap dari array
    public void heapify(int[] arr) {
        // Ukuran array harus sesuai dengan kapasitas
        if (arr.length > capacity) {
            capacity = arr.length;
            heap = new int[capacity];
        }
        
        // Copy elemen array ke heap
        System.arraycopy(arr, 0, heap, 0, arr.length);
        size = arr.length;
        
        // Mulai heapify dari parent node terakhir
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapifyDown(i);
        }
    }
    
    // Heap sort: mengurutkan array dalam urutan menaik
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        // Membuat max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyArray(arr, n, i);
        }
        
        // Ekstrak elemen satu per satu dari heap
        for (int i = n - 1; i > 0; i--) {
            // Pindahkan root (nilai maksimal) ke akhir
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            // Panggil heapify pada tree yang berkurang
            heapifyArray(arr, i, 0);
        }
    }
    
    // Helper method untuk heapify array pada heap sort
    private static void heapifyArray(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        // Jika left child lebih besar dari root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        // Jika right child lebih besar dari largest
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        // Jika largest bukan root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            // Heapify subtree yang terkena dampak
            heapifyArray(arr, n, largest);
        }
    }
    
    // Bubble sort sebagai pembanding
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] dan arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Mencetak heap dalam format yang mudah dibaca
    public void printHeap() {
        if (size == 0) {
            System.out.println("Heap kosong");
            return;
        }
        
        System.out.print("Heap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    
    // Mengecek apakah heap kosong
    public boolean isEmpty() {
        return size == 0;
    }
    
    // Mendapatkan ukuran heap
    public int size() {
        return size;
    }
}