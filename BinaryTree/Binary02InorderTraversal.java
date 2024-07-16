package BinaryTree;

//Iterative way
import java.util.*;

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

public class Binary02InorderTraversal {
    static int idx = -1;

    public static Node buildBinaryTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRootNode = new Node(nodes[idx]);
        newRootNode.left = buildBinaryTree(nodes);
        newRootNode.right = buildBinaryTree(nodes);
        return newRootNode;
    }

    public static List<Integer> iterativeInorder(Node root) {
        List<Integer> Inorder = new ArrayList<>();
        if (root == null) {
            return Inorder;
        }
        Stack<Node> st = new Stack<>();
        Node current = root;
        while (true) {
            if (current != null) {
                st.push(current);
                current = current.left;
            } else {
                if (st.isEmpty()) {
                    break;
                }
                current = st.pop();
                Inorder.add(current.data);
                current = current.right;
            }
        }
        return Inorder;

    }

    static void printlist(List<Integer> l) {
        for (int num : l) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildBinaryTree(nodes);
        List<Integer> list = iterativeInorder(root);
        // System.out.println(list);
        // or call printlist function
        printlist(list);
    }
}
