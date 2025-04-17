public class BinaryTreeMain {
    public static void main(String[] args) {
        // Membuat binary tree dari array
        // -1 menunjukkan null (tidak ada node)
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, 10, 11};
        
        BinaryTree tree = new BinaryTree();
        tree.createBinaryTree(values);
        
        System.out.println("=== IMPLEMENTASI BINARY TREE DAN TRAVERSAL ===\n");
        
        // Melakukan traversal
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        
        // Menghitung jumlah node dan tinggi pohon
        System.out.println("Jumlah node dalam tree: " + tree.countNodes());
        System.out.println("Tinggi tree: " + tree.height());
        
        // Membuat binary tree dengan struktur lebih kompleks
        System.out.println("\n=== BINARY TREE DENGAN STRUKTUR LAIN ===\n");
        
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(50);
        tree2.root.left = new Node(30);
        tree2.root.right = new Node(70);
        tree2.root.left.left = new Node(20);
        tree2.root.left.right = new Node(40);
        tree2.root.right.left = new Node(60);
        tree2.root.right.right = new Node(80);
        
        // Melakukan traversal pada tree kedua
        tree2.inOrderTraversal();
        tree2.preOrderTraversal();
        tree2.postOrderTraversal();
        
        // Menghitung jumlah node dan tinggi pohon kedua
        System.out.println("Jumlah node dalam tree: " + tree2.countNodes());
        System.out.println("Tinggi tree: " + tree2.height());
    }
}