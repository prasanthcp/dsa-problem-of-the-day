package Arrays.Prefix;

/*
Platform: GFG
Problem: Maximum Number of Overlapping Intervals
Category: Arrays / Prefix Sum / Sweep Line
Difficulty: Medium
Date: 17-02-2026

Approach:
- Find maximum end time to determine array size
- For each interval:
    - Increment at start index
    - Decrement at end + 1 index (since end time is inclusive)
- Compute prefix sum to get active intervals at each time
- Track maximum value during prefix traversal

Time Complexity: O(n)
Space Complexity: O(n) ~ O(maxRange)
*/

class Solution {
    
    public static int overlapInt(int[][] arr) {
        
        int n = arr.length;
        
        // If no intervals
        if (n == 0) return 0;
        
        // Step 1: Find maximum end time
        int maxRange = arr[0][1];
        for (int i = 0; i < n; i++) {
            maxRange = Math.max(maxRange, arr[i][1]);
        }
        
        // Step 2: Create difference array
        int[] num = new int[maxRange + 2];
        
        // Step 3: Mark +1 at start and -1 at end+1
        // This treats intervals as closed: [start, end]
        for (int i = 0; i < n; i++) {
            num[arr[i][0]] += 1;
            num[arr[i][1] + 1] -= 1;
        }
        
        // Step 4: Compute prefix sum and track maximum overlap
        int current = 0;
        int ans = 0;
        
        for (int i = 0; i <= maxRange; i++) {
            current += num[i];
            ans = Math.max(ans, current);
        }
        
        return ans;
    }
}
