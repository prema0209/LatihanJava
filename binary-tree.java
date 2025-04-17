import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    
    public BinaryTree() {
        root = null;
    }
    
    // Metode untuk membuat binary tree dari array integer
    public void createBinaryTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        
        root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        for (int i = 1; i < arr.length; i += 2) {
            Node current = queue.poll();
            
            // Left child
            if (i < arr.length && arr[i] != -1) {
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            
            // Right child
            if (i + 1 < arr.length && arr[i + 1] != -1) {
                current.right = new Node(arr[i + 1]);
                queue.add(current.right);
            }
        }
    }
    
    // In-order traversal: Left -> Root -> Right
    public void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }
    
    // Pre-order traversal: Root -> Left -> Right
    public void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        
        System.out.print(node.data + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    
    // Post-order traversal: Left -> Right -> Root
    public void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    
    // Menghitung jumlah node dalam tree
    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
    
    // Menghitung tinggi (kedalaman) tree
    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    // Wrapper methods untuk memanggil traversal dari root
    public void inOrderTraversal() {
        System.out.print("In-order traversal: ");
        inOrderTraversal(root);
        System.out.println();
    }
    
    public void preOrderTraversal() {
        System.out.print("Pre-order traversal: ");
        preOrderTraversal(root);
        System.out.println();
    }
    
    public void postOrderTraversal() {
        System.out.print("Post-order traversal: ");
        postOrderTraversal(root);
        System.out.println();
    }
    
    // Wrapper methods untuk count nodes dan height
    public int countNodes() {
        return countNodes(root);
    }
    
    public int height() {
        return height(root);
    }
}