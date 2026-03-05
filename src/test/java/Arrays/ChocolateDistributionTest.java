package Arrays;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ChocolateDistributionTest {
    private final ChocolateDistribution sol = new ChocolateDistribution();

    @Test
    void basic() {
        ArrayList<Integer> arr = new ArrayList<>(java.util.Arrays.asList(7,3,2,4,9,12));
        assertEquals(2, sol.findMinDiff(arr, 3)); // choose 2,3,4 -> diff=2
    }

    @Test
    void mLessThanTwo() {
        ArrayList<Integer> arr = new ArrayList<>(java.util.Arrays.asList(5));
        assertEquals(0, sol.findMinDiff(arr, 1));
    }
}