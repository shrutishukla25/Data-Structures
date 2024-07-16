package BinaryTree;

import java.util.*;

//Another way of writing
//Preorder PostOrder And InOrder all traversals in one code
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

class Pair {
    Node node;
    int num;

    Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class Binary011 {
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

    // TC=O(3N) SC=O(4N)
    public static List<List<Integer>> preInandPost(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        while (!st.isEmpty()) {
            Pair current = st.pop();
            if (current.num == 1) {
                pre.add(current.node.data);
                current.num++;
                st.push(current);
                if (current.node.left != null) {
                    st.push(new Pair(current.node.left, 1));
                }
            } else if (current.num == 2) {
                in.add(current.node.data);
                current.num++;
                st.push(current);
                if (current.node.right != null) {
                    st.push(new Pair(current.node.right, 1));
                }
            } else {
                post.add(current.node.data);
            }
        }
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, 7, -1, -1 };
        Node root = buildBinaryTree(nodes);
        List<List<Integer>> result = preInandPost(root);
        List<Integer> pre = result.get(0);
        List<Integer> in = result.get(1);
        List<Integer> post = result.get(2);
        System.out.print("Preorder traversal is ");
        System.out.println(pre);
        System.out.print("Inorder traversal is ");
        System.out.println(in);
        System.out.print("Postorder traversal is ");
        System.out.println(post);

    }
}
