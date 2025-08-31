package leetcode.easy;

import org.junit.jupiter.api.Test;
import utils.tree.TreeNode;
import utils.tree.TreeUtils;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P2236_RootEqualsSumOfChildrenTest {
    @Test
    public void testCheckTree1() {
        List<Integer> list = Arrays.asList(10, 4, 6);
        TreeNode root = TreeUtils.buildTree(list);

        P2236_RootEqualsSumOfChildren solution = new P2236_RootEqualsSumOfChildren();
        assertTrue(solution.checkTree(root));
    }

    @Test
    public void testCheckTree2() {
        List<Integer> list = Arrays.asList(5, 3, 1);
        TreeNode root = TreeUtils.buildTree(list);

        P2236_RootEqualsSumOfChildren solution = new P2236_RootEqualsSumOfChildren();
        assertFalse(solution.checkTree(root));
    }
}
