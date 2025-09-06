package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("860. Lemonade Change")
public class P860_LemonadeChangeTest {

    @DisplayName("testLemonadeChange1")
    @Test
    public void testLemonadeChange1() {
        int[] bills = {5, 5, 5, 10, 20};
        boolean expected = true;

        P860_LemonadeChange solution = new P860_LemonadeChange();
        assertEquals(expected, solution.lemonadeChange(bills));
    }

    @DisplayName("testLemonadeChange2")
    @Test
    public void testLemonadeChange2() {
        int[] bills = {5, 5, 10, 10, 20};
        boolean expected = false;

        P860_LemonadeChange solution = new P860_LemonadeChange();
        assertEquals(expected, solution.lemonadeChange(bills));
    }

    @DisplayName("testLemonadeChange3")
    @Test
    public void testLemonadeChange3() {
        int[] bills = {5, 5, 20};
        boolean expected = false;

        P860_LemonadeChange solution = new P860_LemonadeChange();
        assertEquals(expected, solution.lemonadeChange(bills));
    }

    @DisplayName("testLemonadeChange4")
    @Test
    public void testLemonadeChange4() {
        int[] bills = {10};
        boolean expected = false;

        P860_LemonadeChange solution = new P860_LemonadeChange();
        assertEquals(expected, solution.lemonadeChange(bills));
    }

    @DisplayName("testLemonadeChange5")
    @Test
    public void testLemonadeChange5() {
        int[] bills = {5, 10, 10};
        boolean expected = false;

        P860_LemonadeChange solution = new P860_LemonadeChange();
        assertEquals(expected, solution.lemonadeChange(bills));
    }
}
