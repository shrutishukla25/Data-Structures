package BinaryTree;

//Iterative way
import java.util.*;

//STRIVER LEETCODE
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

public class Binary01PreorderTravIterative {
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

    // TC=O(N) SC=O(N){ADDITIONAL SPACE OF QUEUE}{Space used for storing in list is
    // not considered cause we are just storing data
    // and returning it we are not using that space to solve our code}
    public static List<Integer> iterativePreorder(Node root) {
        List<Integer> preorder = new ArrayList<>();
        if (root == null) {
            return preorder;
        }
        Stack<Node> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            Node current = st.pop();
            preorder.add(current.data);
            if (current.right != null) {
                st.push(current.right);
            }
            if (current.left != null) {
                st.push(current.left);
            }
        }
        return preorder;

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
        List<Integer> list = iterativePreorder(root);
        // System.out.println(list);
        // or call printlist function
        printlist(list);
    }
}
