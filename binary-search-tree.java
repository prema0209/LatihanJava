public class BinarySearchTree {
    BSTNode root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    // Metode untuk menambahkan nilai ke dalam BST
    public void insert(int key) {
        root = insertRec(root, key);
    }
    
    // Helper method untuk insert rekursif
    private BSTNode insertRec(BSTNode root, int key) {
        // Jika tree kosong, buat node baru
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }
        
        // Jika key lebih kecil dari root, masukkan ke subtree kiri
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        // Jika key lebih besar dari root, masukkan ke subtree kanan
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        // Jika key sama dengan root, abaikan (tidak ada duplikat)
        
        return root;
    }
    
    // Metode untuk mencari nilai dalam BST
    public boolean search(int key) {
        return searchRec(root, key);
    }
    
    // Helper method untuk search rekursif
    private boolean searchRec(BSTNode root, int key) {
        // Base case: jika root null atau key ditemukan
        if (root == null) {
            return false;
        }
        
        if (root.key == key) {
            return true;
        }
        
        // Jika key lebih kecil dari root, cari di subtree kiri
        if (key < root.key) {
            return searchRec(root.left, key);
        }
        
        // Jika key lebih besar dari root, cari di subtree kanan
        return searchRec(root.right, key);
    }
    
    // Metode untuk menghapus node dengan nilai tertentu
    public void delete(int key) {
        root = deleteRec(root, key);
    }
    
    // Helper method untuk delete rekursif
    private BSTNode deleteRec(BSTNode root, int key) {
        // Base case: jika tree kosong
        if (root == null) {
            return root;
        }
        
        // Cari node yang akan dihapus
        if (key < root.key) {
            // Jika key lebih kecil dari root, cari di subtree kiri
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            // Jika key lebih besar dari root, cari di subtree kanan
            root.right = deleteRec(root.right, key);
        } else {
            // Node dengan key yang sama ditemukan, hapus node ini
            
            // Kasus 1: Node tanpa child atau hanya memiliki satu child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            
            // Kasus 2: Node dengan dua child
            // Temukan successor in-order (nilai terkecil di subtree kanan)
            root.key = findMin(root.right);
            
            // Hapus successor in-order
            root.right = deleteRec(root.right, root.key);
        }
        
        return root;
    }
    
    // Metode untuk menemukan nilai minimum dalam BST
    public int findMin() {
        if (root == null) {
            throw new IllegalStateException("BST kosong");
        }
        
        return findMin(root);
    }
    
    // Helper method untuk mencari nilai minimum dalam subtree
    private int findMin(BSTNode root) {
        int minValue = root.key;
        
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        
        return minValue;
    }
    
    // Metode untuk menemukan nilai maksimum dalam BST
    public int findMax() {
        if (root == null) {
            throw new IllegalStateException("BST kosong");
        }
        
        return findMax(root);
    }
    
    // Helper method untuk mencari nilai maksimum dalam subtree
    private int findMax(BSTNode root) {
        int maxValue = root.key;
        
        while (root.right != null) {
            maxValue = root.right.key;
            root = root.right;
        }
        
        return maxValue;
    }
    
    // Metode untuk memeriksa apakah tree adalah BST yang valid
    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    // Helper method untuk isBST
    private boolean isBSTUtil(BSTNode node, int min, int max) {
        // Base case: pohon kosong adalah BST
        if (node == null) {
            return true;
        }
        
        // Jika nilai node keluar dari range yang diijinkan
        if (node.key < min || node.key > max) {
            return false;
        }
        
        // Cek apakah subtree kiri dan kanan juga BST
        return isBSTUtil(node.left, min, node.key - 1) && 
               isBSTUtil(node.right, node.key + 1, max);
    }
    
    // Metode untuk in-order traversal (akan menampilkan nilai dalam urutan terurut)
    public void inOrderTraversal() {
        System.out.print("In-order traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }
    
    private void inOrderTraversal(BSTNode node) {
        if (node == null) {
            return;
        }
        
        inOrderTraversal(node.left);
        System.out.print(node.key + " ");
        inOrderTraversal(node.right);
    }
}