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

class Binary1PreorderTraversal {
    int idx = -1;

    public Node buildBinaryTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRootNode = new Node(nodes[idx]);
        newRootNode.left = buildBinaryTree(nodes);
        newRootNode.right = buildBinaryTree(nodes);
        return newRootNode;
    }

    // Time Complexity of Preorder Traversal is =O(n) As we are traversing througth
    // each node
    public void preorderTraversal(Node root) {
        if (root == null) {
            // System.out.print("-1" + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Binary1PreorderTraversal p = new Binary1PreorderTraversal();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // int nodes[] = { 1, -1, 3, 4, 5, -1, -1, -1, 6, -1, 7, -1, 8, -1, 10, -1, -1
        // };
        Node root = p.buildBinaryTree(nodes); // This is how we make call to static method
        p.preorderTraversal(root);
    }
}