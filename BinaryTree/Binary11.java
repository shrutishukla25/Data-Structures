package BinaryTree;

//Preorder PostOrder And InOrder all traversals in one code
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

class Pair {
    Node node;
    int num;

    Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class Binary11 {
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
    public static void PreInPost(Node root, List<Integer> preOrder, List<Integer> inOrder, List<Integer> postOrder) {
        if (root == null) {
            return;
        }
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));
        while (!st.isEmpty()) {
            Pair current = st.pop();
            if (current.num == 1) {
                preOrder.add(current.node.data);
                current.num++;
                st.push(current);
                if (current.node.left != null) {
                    st.push(new Pair(current.node.left, 1));
                }

            } else if (current.num == 2) {
                inOrder.add(current.node.data);
                current.num++;
                st.push(current);
                if (current.node.right != null) {
                    st.push(new Pair(current.node.right, 1));
                }

            } else {
                postOrder.add(current.node.data);
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 3, -1, -1, 4, -1, -1, 5, 6, -1, -1, 7, -1, -1 };
        Node root = buildBinaryTree(nodes);
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        PreInPost(root, preOrder, inOrder, postOrder);
        System.out.print("Preorder Traversal ");
        System.out.println(preOrder);
        System.out.print("Inorder Traversal ");
        System.out.println(inOrder);
        System.out.print("Postorder Traversal ");
        System.out.println(postOrder);

    }
}
