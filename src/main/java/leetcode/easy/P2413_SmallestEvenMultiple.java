package leetcode.easy;

public class P2413_SmallestEvenMultiple {

    /**
     * @param n
     * @return
     * @link https://leetcode.cn/problems/smallest-even-multiple/
     * @author Jaxien
     * @since 2025/07/14
     */
    public int smallestEvenMultiple(int n) {
        return n << (n % 2);
    }
}
