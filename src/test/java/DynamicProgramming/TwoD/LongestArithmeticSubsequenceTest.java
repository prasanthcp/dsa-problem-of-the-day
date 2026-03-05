package DynamicProgramming.TwoD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestArithmeticSubsequenceTest {
    private final LongestArithmeticSubsequence sol = new LongestArithmeticSubsequence();

    @Test
    void example() {
        int[] nums = {3,6,9,12};
        assertEquals(4, sol.longestArithSeqLength(nums));
    }

    @Test
    void twoElement() {
        int[] nums = {1,2};
        assertEquals(2, sol.longestArithSeqLength(nums));
    }
}