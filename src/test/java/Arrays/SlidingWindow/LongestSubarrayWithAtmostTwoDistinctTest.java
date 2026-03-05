package Arrays.SlidingWindow;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayWithAtmostTwoDistinctTest {
    private final LongestSubarrayWithAtmostTwoDistinct sol = new LongestSubarrayWithAtmostTwoDistinct();

    @Test
    void basic() {
        int[] arr = {1,2,1,2,3};
        assertEquals(4, sol.totalElements(arr)); // subarray [1,2,1,2]
    }

    @Test
    void allSame() {
        int[] arr = {5,5,5};
        assertEquals(3, sol.totalElements(arr));
    }

    @Test
    void threeDistinct() {
        int[] arr = {1,2,3};
        assertEquals(2, sol.totalElements(arr));
    }
}