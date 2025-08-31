package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P258_AddDigitsTest {
    @Test
    public void testAddDigits1() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(2, solution.addDigits1(38));
    }

    @Test
    public void testAddDigits2() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(0, solution.addDigits1(0));
    }

    @Test
    public void testAddDigits3() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(2, solution.addDigits2(38));
    }

    @Test
    public void testAddDigits4() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(0, solution.addDigits2(0));
    }

    @Test
    public void testAddDigits5() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(2, solution.addDigits3(38));
    }

    @Test
    public void testAddDigits6() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(0, solution.addDigits3(0));
    }

    @Test
    public void testAddDigits7() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(2, solution.addDigits4(38));
    }

    @Test
    public void testAddDigits8() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(0, solution.addDigits4(0));
    }

    @Test
    public void testAddDigits9() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(2, solution.addDigits5(38));
    }

    @Test
    public void testAddDigits10() {
        P258_AddDigits solution = new P258_AddDigits();
        assertEquals(0, solution.addDigits5(0));
    }
}
