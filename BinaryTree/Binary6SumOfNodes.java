package BinaryTree;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary6SumOfNodes {
    static int idx = -1;

    static Node builtTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRNOde = new Node(nodes[idx]);
        newRNOde.left = builtTree(nodes);
        newRNOde.right = builtTree(nodes);
        return newRNOde;
    }

    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int sumLeft = sumOfNodes(root.left);
        int sumRight = sumOfNodes(root.right);
        return sumLeft + sumRight + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = builtTree(nodes);
        System.out.println("Total Sum is " + sumOfNodes(root));
    }
}
