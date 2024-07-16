package BinaryTree;

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

class TreeInform {
    int ht;
    int diam;

    TreeInform(int ht, int diam) {
        this.ht = ht;
        this.diam = diam;
    }
}

class BinaryP {
    public static TreeInform CalculateDIam(Node root) {
        if (root == null) {
            return new TreeInform(0, 0);
        }
        TreeInform left = CalculateDIam(root.left);
        TreeInform right = CalculateDIam(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDIam = Math.max(diam1, Math.max(diam2, diam3));
        return new TreeInform(myHeight, myDIam);
    }

    static int idx = -1;

    public static Node buildtree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRNode = new Node(nodes[idx]);
        newRNode.left = buildtree(nodes);
        newRNode.right = buildtree(nodes);
        return newRNode;
    }

    public static void main(String args[]) {
        int nodes[] = { 1, -1, 3, 4, 5, -1, -1, -1, 6, -1, 7, -1, 8, -1, 10, -1, -1 };
        Node root = buildtree(nodes);
        TreeInform diameter = CalculateDIam(root);
        System.out.println("Diameter is " + diameter.diam);
    }
}