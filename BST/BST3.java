package BST;

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

// Delete a node from BInary Search Tree
public class BST3 {
    public static Node builtBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data) {
            root.left = builtBST(root.left, val);
        } else {
            root.right = builtBST(root.right, val);
        }
        return root;
    }

    public static void inorderTrav(Node root) {
        if (root == null) {
            return;
        }
        inorderTrav(root.left);
        System.out.print(root.data + " ");
        inorderTrav(root.right);
    }

    // Time Complexity=O(H)
    public static Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // root.data==val
            // CASE 1 no child
            if (root.right == null && root.left == null) {
                return null;
            }
            // CASE 2-->1 child
            if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                // CASE 3->2 children
                Node inorderSucc = inorderSuccessor(root.right);
                root.data = inorderSucc.data;
                root.right = delete(root.right, inorderSucc.data);
            }
        }
        return root;

    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 12 };
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = builtBST(root, nodes[i]);
        }
        inorderTrav(root);
        System.out.println();
        int val = 10;
        delete(root, val);
        inorderTrav(root);

    }
}
