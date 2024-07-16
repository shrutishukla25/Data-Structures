package BinaryTree;

//CHECK LEETCODE  
import java.util.*;

class Node {
    int data;
    Node left = null;
    Node right = null;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary4levelOrder {
    static int idx = -1;

    public static Node buildBinaryTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRNode = new Node(nodes[idx]);
        newRNode.left = buildBinaryTree(nodes);
        newRNode.right = buildBinaryTree(nodes);
        return newRNode;
    }

    // Time Complexity of levelorder Traversal is =O(n)
    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            // If queue Have null it means queue is not empty
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildBinaryTree(nodes);
        // System.out.println(root.data);
        levelOrderTraversal(root);
    }
}