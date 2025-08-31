package utils.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class TreeUtilsTest {
    @Test
    public void testBuildTree() {
        List<Integer> list = Arrays.asList(1, 2, 3, null, 4, 5, null);
        TreeNode root = TreeUtils.buildTree(list);

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
        assertNull(root.left.left);
        assertEquals(4, root.left.right.val);
        assertEquals(5, root.right.left.val);
        assertNull(root.right.right);
    }

    @Test
    public void testLevelOrder() {
        List<Integer> list = Arrays.asList(1, 2, 3, null, 4, 5);
        TreeNode root = TreeUtils.buildTree(list);

        List<Integer> output = TreeUtils.levelOrder(root);
        assertEquals(list, output); // 两个 List 应该相等
    }
}
