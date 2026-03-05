package Arrays.Sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InversionCountTest {
    @Test
    void simpleCase() {
        int[] arr = {2, 4, 1, 3, 5};
        assertEquals(3, InversionCount.inversionCount(arr)); // pairs: (2,1),(4,1),(4,3)
    }

    @Test
    void alreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, InversionCount.inversionCount(arr));
    }

    @Test
    void reverseSorted() {
        int[] arr = {5,4,3,2,1};
        assertEquals(10, InversionCount.inversionCount(arr));
    }
}