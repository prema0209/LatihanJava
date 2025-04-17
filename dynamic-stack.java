import java.util.ArrayList;

public class DynamicStack {
    private ArrayList<String> stack;
    
    // Constructor
    public DynamicStack() {
        stack = new ArrayList<>();
    }
    
    // Menambahkan elemen ke stack
    public void push(String item) {
        stack.add(item);
    }
    
    // Menghapus dan mengembalikan elemen teratas
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong, tidak dapat melakukan pop");
        }
        return stack.remove(stack.size() - 1);
    }
    
    // Mengembalikan elemen teratas tanpa menghapus
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack kosong, tidak dapat melakukan peek");
        }
        return stack.get(stack.size() - 1);
    }
    
    // Memeriksa apakah stack kosong
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    
    // Mengembalikan jumlah elemen dalam stack
    public int size() {
        return stack.size();
    }
    
    // Menampilkan isi stack (untuk debugging)
    @Override
    public String toString() {
        return stack.toString();
    }
}