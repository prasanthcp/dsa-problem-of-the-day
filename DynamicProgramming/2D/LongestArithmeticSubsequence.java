/* Platform: LeetCode | Problem: Longest Arithmetic Subsequence 
Category: Dynamic Programming | Difficulty: Medium | Date: 15-02-2026

Approach:
- Use a HashMap where: diff -> (index -> length)
- For every pair (j, i):
      • Compute diff = nums[i] - nums[j]
      • If a sequence with this diff ended at j, extend it
      • Otherwise start a new sequence of length 2
- Store updated length at index i for that diff
- Track the global maximum length

Time Complexity: O(n^2) | Space Complexity: O(n^2)
*/

import java.util.HashMap;

class Solution {
     
    public int longestArithSeqLength(int[] nums) {
        
        int n = nums.length;

        // Base case: If array has 2 or fewer elements,
        // entire array itself is arithmetic
        if(n <= 2) return n;

        /*
         hm structure:
         
         diff  ->  ( index -> length )
         
         For a given difference:
         inner map stores:
         index i -> length of arithmetic subsequence
                    ending at index i with this diff
        */
        HashMap<Integer, HashMap<Integer, Integer>> hm 
                        = new HashMap<>();

        int maxfreq = 2;   // minimum arithmetic sequence length is 2

        // Fix current endpoint i
        for(int i = 0; i < n; i++) {

            // Try extending sequences ending at j
            for(int j = 0; j < i; j++) {

                // Compute difference between pair (j, i)
                int diff = nums[i] - nums[j]; 
                
                // If this difference is not seen before,
                // create a new inner map for it
                hm.putIfAbsent(diff, new HashMap<>());

                // Get the map for this diff
                HashMap<Integer, Integer> inner = hm.get(diff);
                
                /*
                 If there was already a sequence ending at j 
                 with this same diff, extend it.
                 
                 Otherwise start a new sequence of length 2.
                 
                 inner.getOrDefault(j, 1):
                 - If not found → assume length 1 at j
                 - So new length becomes 2
                */
                int currLen = inner.getOrDefault(j, 1) + 1;
                
                // Store the updated length for index i
                inner.put(i, currLen);

                // Update global maximum
                maxfreq = Math.max(maxfreq, currLen);
            }
        }

        return maxfreq;
    }
}
