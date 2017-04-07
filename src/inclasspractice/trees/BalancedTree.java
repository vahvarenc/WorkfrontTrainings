package inclasspractice.trees;

/**
 * Created by Karen on 4/4/2017.
 */
public class BalancedTree {
    Node root;

    public BalancedTree(Node root) {
        this.root = root;
    }

    public Node add(int x, Node bstree)
    {
        if (bstree == null)  return new Node(x);
        // bstree is not null.
        if (x < bstree.value)
        {
            // Add x to the left subtree and replace the
            // current left subtree with the result
            bstree.left = add(x, bstree.left);
        }
        else
        {
            // Add x to the right subtree
            bstree.right = add(x, bstree.right);
        }
        return bstree;
    }

    private static int getHeight(Node tree){
        if(tree == null){
            return 0;
        }
        return 1 + Math.max(getHeight(tree.left), getHeight(tree.right));
    }

    public static boolean isBalanced(Node tree){
        if (tree == null){
            return  true;
        }
        int heightDif = Math.abs(getHeight(tree.left) - getHeight(tree.right));
        if(heightDif > 1){
            return false;
        }else{
            return isBalanced(tree.left) && isBalanced(tree.right);
        }
    }

    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
