package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1502. Can Make Arithmetic Progression From Sequence")
public class P1502_CanMakeArithmeticProgressionFromSequenceTest {
    @DisplayName("testCanMakeArithmeticProgression1")
    @Test
    public void testCanMakeArithmeticProgression1() {
        int[] arr = {3, 5, 1};
        boolean expected = true;

        P1502_CanMakeArithmeticProgressionFromSequence solution = new P1502_CanMakeArithmeticProgressionFromSequence();
        assertEquals(expected, solution.canMakeArithmeticProgression(arr));
    }

    @DisplayName("testCanMakeArithmeticProgression2")
    @Test
    public void testCanMakeArithmeticProgression2() {
        int[] arr = {1, 2, 4};
        boolean expected = false;

        P1502_CanMakeArithmeticProgressionFromSequence solution = new P1502_CanMakeArithmeticProgressionFromSequence();
        assertEquals(expected, solution.canMakeArithmeticProgression(arr));
    }

    @DisplayName("testCanMakeArithmeticProgression3")
    @Test
    public void testCanMakeArithmeticProgression3() {
        int[] arr = {-1, 2};
        boolean expected = true;

        P1502_CanMakeArithmeticProgressionFromSequence solution = new P1502_CanMakeArithmeticProgressionFromSequence();
        assertEquals(expected, solution.canMakeArithmeticProgression(arr));
    }
}
