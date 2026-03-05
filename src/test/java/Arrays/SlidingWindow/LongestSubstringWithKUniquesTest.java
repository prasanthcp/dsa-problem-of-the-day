package Arrays.SlidingWindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the LongestSubstringWithKUniques class.
 */
class LongestSubstringWithKUniquesTest {
    private final LongestSubstringWithKUniques solution = new LongestSubstringWithKUniques();

    @Test
    void testExampleCase() {
        // Test case 1: Example from the comment
        assertEquals(7, solution.longestKSubstr("aabacbebebe", 3));
    }

    @Test
    void testAllUnique() {
        // Test case 2: All unique characters, k=2
        assertEquals(2, solution.longestKSubstr("abcde", 2));
    }

    @Test
    void testStringShorterThanK() {
        // Test case 3: String shorter than k
        assertEquals(-1, solution.longestKSubstr("ab", 3));
    }

    @Test
    void testAllSameCharacters() {
        // Test case 4: All same characters, k=1
        assertEquals(5, solution.longestKSubstr("aaaaa", 1));
    }

    @Test
    void testWholeStringHasExactlyKUniques() {
        // Test case 5: Whole string has exactly k uniques
        assertEquals(6, solution.longestKSubstr("aabbcc", 3));
    }

    @Test
    void testEmptyString() {
        // Edge case: Empty string
        assertEquals(-1, solution.longestKSubstr("", 1));
    }

    @Test
    void testKEqualsZero() {
        // Edge case: k=0, should return -1 or handle appropriately, but based on logic, if k=0, length <0 is false, but probably not intended
        // Assuming k >=1, but to test
        assertEquals(-1, solution.longestKSubstr("a", 0)); // Though length=1 >=0, but logic checks length <k
    }
}