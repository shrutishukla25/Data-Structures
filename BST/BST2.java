package BST;

//Search Node is BST
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BST2 {
    // Insert time complexity=O(H)
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // TC=O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (key == root.data) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);

        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println(search(root, 6));
    }
}
