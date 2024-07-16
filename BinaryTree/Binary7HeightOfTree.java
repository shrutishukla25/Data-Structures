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

class Binary7HeightOfTree {

    static int idx = -1;

    public static Node buildingTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newRoot = new Node(nodes[idx]);
        newRoot.left = buildingTree(nodes);
        newRoot.right = buildingTree(nodes);
        return newRoot;
    }

    static int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = buildingTree(nodes);
        System.out.println("The height of your tree is " + calculateHeight(root));
    }
}
