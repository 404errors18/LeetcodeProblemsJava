package utils.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeUtils {
    /**
     * 根据二叉树的层次遍历生成二叉树并返回根节点
     *
     * @param list 二叉树的层次遍历
     * @return 二叉树的根节点
     */
    public static TreeNode buildTree(List<Integer> list) {
        if (list == null || list.isEmpty() || list.get(0) == null) {
            return null;
        }

        TreeNode root = new TreeNode(list.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < list.size()) {
            TreeNode current = queue.poll();

            // 左子树
            if (i < list.size() && list.get(i) != null) {
                if (current != null) {
                    current.left = new TreeNode(list.get(i));
                    queue.offer(current.left);
                }
            }
            i++;

            // 右子树
            if (i < list.size() && list.get(i) != null) {
                if (current != null) {
                    current.right = new TreeNode(list.get(i));
                    queue.offer(current.right);
                }
            }
            i++;
        }

        return root;
    }

    // 层序遍历，输出成 List<Integer>
    public static List<Integer> levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add(null);
            }
        }

        // 去掉末尾多余的 null（否则树 [1,2,3] 会输出 [1,2,3,null,null,null,null]）
        int i = result.size() - 1;
        while (i >= 0 && result.get(i) == null) {
            result.remove(i);
            i--;
        }

        return result;
    }
}
