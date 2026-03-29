package leetcode.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Leetcode Problem #9. Palindrome Number")
public class P9PalindromeNumberTest {
    @DisplayName("palindromeNumberTestCase1")
    @Test
    public void palindromeNumberTestCase1() {
        int x = 121;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertTrue(solution.isPalindrome(x));
    }

    @DisplayName("palindromeNumberTestCase2")
    @Test
    public void palindromeNumberTestCase2() {
        int x = -121;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertFalse(solution.isPalindrome(x));
    }

    @DisplayName("palindromeNumberTestCase3")
    @Test
    public void palindromeNumberTestCase3() {
        int x = 10;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertFalse(solution.isPalindrome(x));
    }

    @DisplayName("palindromeNumberTestCase4")
    @Test
    public void palindromeNumberTestCase4() {
        int x = 1221;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertTrue(solution.isPalindrome(x));
    }

    @DisplayName("palindromeNumberTestCase5")
    @Test
    public void palindromeNumberTestCase5() {
        int x = 12321;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertTrue(solution.isPalindrome(x));
    }


    @DisplayName("palindromeNumberTestCase6")
    @Test
    public void palindromeNumberTestCase6() {
        int x = 12341;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertFalse(solution.isPalindrome(x));
    }


    @DisplayName("palindromeNumberTestCase7")
    @Test
    public void palindromeNumberTestCase7() {
        int x = 11223311;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertFalse(solution.isPalindrome(x));
    }

    @DisplayName("palindromeNumberTestCase8")
    @Test
    public void palindromeNumberTestCase8() {
        int x = 0;

        P9PalindromeNumber solution = new P9PalindromeNumber();
        assertTrue(solution.isPalindrome(x));
    }


}
