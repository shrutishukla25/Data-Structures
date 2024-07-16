package BinaryTree;

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

class TreeInfo {
    int height;
    int diameter;

    TreeInfo(int ht, int diam) {
        this.height = ht;
        this.diameter = diam;
    }
}

class Binary08findDIameter {
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

    // TC=O(N)
    public static TreeInfo findDiameterwithHeight(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = findDiameterwithHeight(root.left);
        TreeInfo right = findDiameterwithHeight(root.right);
        int myheight = Math.max(left.height, right.height) + 1;
        int diam1 = left.diameter;
        int diam2 = right.diameter;
        int diam3 = left.height + right.height + 1;
        int mydiameter = Math.max(Math.max(diam1, diam2), diam3);
        return new TreeInfo(myheight, mydiameter);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildBinaryTree(nodes);
        TreeInfo print = findDiameterwithHeight(root);
        System.out.println("The Diameter is " + print.diameter);
    }
}
