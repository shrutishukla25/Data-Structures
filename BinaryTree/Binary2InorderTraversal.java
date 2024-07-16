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

class Binary2InorderTraversal {
    int idx = -1;

    public Node builtthetree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRootNode = new Node(nodes[idx]);
        newRootNode.left = builtthetree(nodes);
        newRootNode.right = builtthetree(nodes);
        return newRootNode;
    }

    // Time Complexity of Preorder Traversal is =O(n)
    public void inorderTraversal(Node root) {
        if (root == null) {
            System.out.print("-1" + " ");
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binary2InorderTraversal b = new Binary2InorderTraversal();
        Node root = b.builtthetree(nodes);
        System.out.println(root.data);
        b.inorderTraversal(root);
    }
}
