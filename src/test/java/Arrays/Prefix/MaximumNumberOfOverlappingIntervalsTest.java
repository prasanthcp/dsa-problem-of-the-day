package Arrays.Prefix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfOverlappingIntervalsTest {
    @Test
    void simple() {
        int[][] intervals = {{1,3},{2,5},{4,6}};
        assertEquals(2, MaximumNumberOfOverlappingIntervals.overlapInt(intervals));
    }

    @Test
    void nonOverlapping() {
        int[][] intervals = {{0,1},{2,3}};
        assertEquals(1, MaximumNumberOfOverlappingIntervals.overlapInt(intervals));
    }
}