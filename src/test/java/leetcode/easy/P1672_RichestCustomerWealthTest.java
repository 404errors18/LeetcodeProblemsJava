package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Leetcode Problem #1672. Richest Customer Wealth")
public class P1672_RichestCustomerWealthTest {

    @DisplayName("testMaximumWealth1")
    @Test
    public void testMaximumWealth1() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int expected = 6;

        P1672_RichestCustomerWealth solution = new P1672_RichestCustomerWealth();
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @DisplayName("testMaximumWealth2")
    @Test
    public void testMaximumWealth2() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int expected = 10;

        P1672_RichestCustomerWealth solution = new P1672_RichestCustomerWealth();
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @DisplayName("testMaximumWealth3")
    @Test
    public void testMaximumWealth3() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int expected = 17;

        P1672_RichestCustomerWealth solution = new P1672_RichestCustomerWealth();
        assertEquals(expected, solution.maximumWealth(accounts));
    }
}
