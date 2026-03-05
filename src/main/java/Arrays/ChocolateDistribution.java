package Arrays;

/*
Platform: GFG
Problem: Chocolate Distribution Problem
Category: Arrays / Sorting / Sliding Window
Difficulty: Easy-Medium
Date: 15-02-2026

Approach:
- Sort the array
- Use sliding window of size m
- Track minimum difference

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.ArrayList;
import java.util.Collections;

class ChocolateDistribution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        
        if(m<2) return 0;
        
        int diff = Integer.MAX_VALUE;
        Collections.sort(arr);
        
        for(int i=0;i<arr.size();i++)
            if(i+m-1 < arr.size() && arr.get(i+m-1)-arr.get(i) < diff) 
                diff = arr.get(i+m-1)-arr.get(i);
        
        return diff;
    }
}