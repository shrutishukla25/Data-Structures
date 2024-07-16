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

class Binary9SubtreeOfAnotherTree {
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

    static int index = -1;

    public static Node builsubrootdtree(int subnodes[]) {
        index++;
        if (subnodes[index] == -1) {
            return null;
        }
        Node newRNode = new Node(subnodes[index]);
        newRNode.left = builsubrootdtree(subnodes);
        newRNode.right = builsubrootdtree(subnodes);
        return newRNode;
    }

    static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        }
        if (root == null || subroot == null) {
            return false;
        }
        if (root.data == subroot.data) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    static boolean isSubtree(Node root, Node subroot) {
        if (subroot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int subnodes[] = { 2, 4, -1, -1, 5, -1, -1 };
        Node root = buildtree(nodes);
        Node subroot = builsubrootdtree(subnodes);
        System.out.println("Given tree is subtree of Main Tree " + isSubtree(root, subroot));
    }
}
