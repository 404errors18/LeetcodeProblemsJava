package leetcode.easy;

import utils.tree.TreeNode;


public class P2236_RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
