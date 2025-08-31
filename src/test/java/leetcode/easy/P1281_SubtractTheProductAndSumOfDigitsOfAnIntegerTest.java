package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P1281_SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
    @Test
    public void testSubtractTheProductAndSumOfDigitsOfAnInteger1() {
        P1281_SubtractTheProductAndSumOfDigitsOfAnInteger solution = new P1281_SubtractTheProductAndSumOfDigitsOfAnInteger();
        int result = solution.subtractProductAndSum(234);
        assertEquals(15, result);
    }

    @Test
    public void testSubtractTheProductAndSumOfDigitsOfAnInteger2() {
        P1281_SubtractTheProductAndSumOfDigitsOfAnInteger solution = new P1281_SubtractTheProductAndSumOfDigitsOfAnInteger();
        int result = solution.subtractProductAndSum(4421);
        assertEquals(21, result);
    }
}
