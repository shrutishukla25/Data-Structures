package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

//SUM OF NODES AT Kth LEVEL
// DONE ON MY OWN
class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Binary10 {
    static int idx = -1;

    public static Node buildThetree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRNode = new Node(nodes[idx]);
        newRNode.left = buildThetree(nodes);
        newRNode.right = buildThetree(nodes);
        return newRNode;
    }

    public static int sumAtKthLevel(Node root, int level) {
        if (root == null) {
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int k = 1;
        int sum = 0;
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                k++;
                if (q.isEmpty() || k > level) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                if (k == level) {
                    sum += currNode.data;
                }
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildThetree(nodes);
        int level = 1;
        System.out.println("Sum of Nodes in " + level + " level is " + sumAtKthLevel(root, level));

    }
}
