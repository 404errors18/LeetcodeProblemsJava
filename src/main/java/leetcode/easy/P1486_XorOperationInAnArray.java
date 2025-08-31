package leetcode.easy;

/**
 * 1486. XOR Operation in an Array
 *
 * @author Jaxien
 * @link <a href="https://leetcode.cn/problems/xor-operation-in-an-array/">1486. 数组异或操作</a>
 * @since 2025-07-16
 */
public class P1486_XorOperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = start;

        for (int i = 1; i < n; i++) {
            result ^= start + (i << 1);
        }

        return result;
    }
}
