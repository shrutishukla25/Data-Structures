package BinaryTree;

//LEETCODE and strivers notes
//In this level order traversal data is stored in list  which will have levelwise records of data in nodes in
//separate lists.
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

public class Binary04LevelOrderTraversal {
    // TC=O(N)
    // SC=O(N) for Queue
    // Space for Lists are not taken in account cause here we are just storing data
    // and returning it we are not using that space to solve our code
    public static List<List<Integer>> levlOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> L = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node currNode = q.remove();
                L.add(currNode.data);
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            ans.add(L);
        }
        return ans;
    }

    public static void printList(List<Integer> a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        List<List<Integer>> level = levlOrder(root);
        for (List<Integer> a : level) {
            printList(a);
            // Or simply use sopln() instead
            // System.out.println(a);
        }
    }
}
