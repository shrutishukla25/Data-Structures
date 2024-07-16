package BinaryTree;

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

public class Binary8findDIameter {
    static int idx = -1;

    static Node Buildingatree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRnode = new Node(nodes[idx]);
        newRnode.left = Buildingatree(nodes);
        newRnode.right = Buildingatree(nodes);
        return newRnode;
    }

    // Time Complexity=O(N^2);
    static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diamLeft = diameterOfTree(root.left);
        int diamRight = diameterOfTree(root.right);
        int diamroot = Height(root.left) + Height(root.right) + 1;
        return Math.max(diamLeft, Math.max(diamRight, diamroot));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = Buildingatree(nodes);
        System.out.println("Diameter of a Tree is " + diameterOfTree(root));
    }
}
