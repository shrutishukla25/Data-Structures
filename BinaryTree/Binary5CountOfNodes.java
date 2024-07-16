package BinaryTree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary5CountOfNodes {
    static int idx = -1;

    static TreeNode Builttree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        TreeNode newNode = new TreeNode(nodes[idx]);
        newNode.left = Builttree(nodes);
        newNode.right = Builttree(nodes);
        return newNode;
    }

    static int countOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int countofleft = countOfNodes(root.left);
        int countofright = countOfNodes(root.right);
        return countofleft + countofright + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        TreeNode root = Builttree(nodes);
        // System.out.println(root.data);
        System.out.println("No of nodes are " + countOfNodes(root));
    }
}
