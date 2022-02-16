public class TreeTraversal {
    Node root;

    void printInOrder(Node node) {
        if (node == null)
            return;

        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);

    }

    void printPreOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null)
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        // Building Tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Traversing tree
        TreeTraversal treeTraversal = new TreeTraversal();
        System.out.print("Inorder Traversal: ");
        treeTraversal.printInOrder(tree.root);

        System.out.println();

        System.out.print("Preorder Traversal: ");
        treeTraversal.printPreOrder(tree.root);

        System.out.println();

        System.out.print("Postorder Traversal: ");
        treeTraversal.printPostOrder(tree.root);

    }
}
