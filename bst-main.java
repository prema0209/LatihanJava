public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        System.out.println("=== IMPLEMENTASI BINARY SEARCH TREE (BST) ===\n");
        
        // Menambahkan beberapa nilai ke dalam BST
        System.out.println("Menambahkan nilai: 50, 30, 70, 20, 40, 60, 80");
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        // Menampilkan struktur BST dengan in-order traversal
        System.out.println("\nBST setelah insert (in-order traversal):");
        bst.inOrderTraversal();
        
        // Memeriksa apakah pohon adalah BST yang valid
        System.out.println("Apakah pohon adalah BST valid? " + bst.isBST());
        
        // Mencari nilai dalam BST
        int searchKey1 = 40;
        int searchKey2 = 55;
        System.out.println("\nMencari nilai " + searchKey1 + ": " + bst.search(searchKey1));
        System.out.println("Mencari nilai " + searchKey2 + ": " + bst.search(searchKey2));
        
        // Menemukan nilai minimum dan maksimum dalam BST
        System.out.println("\nNilai minimum dalam BST: " + bst.findMin());
        System.out.println("Nilai maksimum dalam BST: " + bst.findMax());
        
        // Menghapus node dengan satu child
        System.out.println("\nMenghapus nilai 20 (node dengan nol child)");
        bst.delete(20);
        System.out.println("BST setelah menghapus 20:");
        bst.inOrderTraversal();
        
        // Menghapus node dengan satu child
        System.out.println("\nMenghapus nilai 30 (node dengan satu child)");
        bst.delete(30);
        System.out.println("BST setelah menghapus 30:");
        bst.inOrderTraversal();
        
        // Menghapus node dengan dua child
        System.out.println("\nMenghapus nilai 50 (node root dengan dua child)");
        bst.delete(50);
        System.out.println("BST setelah menghapus 50 (root):");
        bst.inOrderTraversal();
        
        // Memeriksa kembali minimum dan maksimum setelah penghapusan
        System.out.println("\nNilai minimum dalam BST setelah penghapusan: " + bst.findMin());
        System.out.println("Nilai maksimum dalam BST setelah penghapusan: " + bst.findMax());
        
        // Memeriksa apakah pohon masih BST yang valid
        System.out.println("\nApakah pohon masih BST valid setelah penghapusan? " + bst.isBST());
    }
}