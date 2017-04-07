package inclasspractice.trees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Karen on 4/4/2017.
 */

public class BalancedTreeTest {

    @Test
    public void isBalanced_True() throws Exception {
        BalancedTree.Node root = new BalancedTree.Node(10);
        BalancedTree bt = new BalancedTree(root);
        bt.add(5, root);
        bt.add(7, root);
        bt.add(13, root);
        bt.add(21, root);
        bt.add(1, root);
        assertTrue(BalancedTree.isBalanced(root));
    }

    @Test
    public void isBalanced_false() throws Exception {
        BalancedTree.Node root = new BalancedTree.Node(10);
        BalancedTree bt = new BalancedTree(root);
        for (int i = 5; i < 15; i++) {
            bt.add(2 * i, root);
        }
        bt.add(5, root);
        bt.add(7, root);
        bt.add(13, root);
        bt.add(21, root);
        bt.add(47, root);
        assertFalse(BalancedTree.isBalanced(root));
    }

    @Test
    public void isBalanced_containsThreeNodes_True(){
        BalancedTree.Node root = new BalancedTree.Node(10);
        BalancedTree bt = new BalancedTree(root);
        bt.add(5, root);
        bt.add(15, root);
        assertTrue(BalancedTree.isBalanced(root));
    }
}
