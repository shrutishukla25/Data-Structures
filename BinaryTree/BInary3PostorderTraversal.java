package BinaryTree;

//CHECK LEETCODE
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

class BInary3PostorderTraversal {
    static int idx = -1;

    public static Node builtthetree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRootNode = new Node(nodes[idx]);
        newRootNode.left = builtthetree(nodes);
        newRootNode.right = builtthetree(nodes);
        return newRootNode;
    }

    // Time Complexity of Postorder Traversal is =O(n)
    public static void PostOrderTraversal(Node root) {
        if (root == null) {
            System.out.print("-1" + " ");
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = builtthetree(nodes);
        System.out.println(root.data);
        PostOrderTraversal(root);
    }
}
