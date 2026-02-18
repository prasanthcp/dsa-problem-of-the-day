package Arrays.Sorting;

/*
Platform: GFG
Problem: Count Inversions
Category: Arrays / Divide & Conquer / Merge Sort
Difficulty: Medium
Date: 16-02-2026

Problem Statement:
Given an array of integers, count the number of inversions.
An inversion is a pair (i, j) such that:
    i < j and arr[i] > arr[j]

Approach:
- Use Merge Sort (Divide and Conquer)
- Recursively divide the array into halves
- While merging:
    - If left element <= right element → no inversion
    - If left element > right element → 
        All remaining elements in left half form inversions
        Count = (mid - i + 1)

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {

    static int inversionCount(int arr[]) {
        return mergesort(arr, 0, arr.length - 1);
    }

    // Recursive merge sort
    static int mergesort(int[] arr, int start, int end) {

        // Base case: single element
        if (start >= end) return 0;

        int mid = start + (end - start) / 2;
        int count = 0;

        // Count inversions in left half
        count += mergesort(arr, start, mid);

        // Count inversions in right half
        count += mergesort(arr, mid + 1, end);

        // Count cross inversions while merging
        count += merge(arr, start, mid, end);

        return count;
    }

    // Merge two sorted halves and count cross inversions
    static int merge(int[] arr, int start, int mid, int end) {

        int i = start;      // pointer for left half
        int j = mid + 1;    // pointer for right half
        int k = 0;
        int count = 0;

        int[] merged = new int[end - start + 1];

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                // No inversion
                merged[k++] = arr[i++];
            } else {
                // Inversion found
                merged[k++] = arr[j++];

                // All remaining elements in left half
                // form inversions with arr[j]
                count += (mid - i + 1);
            }
        }

        // Copy remaining elements
        while (i <= mid)
            merged[k++] = arr[i++];

        while (j <= end)
            merged[k++] = arr[j++];

        // Copy merged result back to original array
        for (int q = 0; q < merged.length; q++)
            arr[start + q] = merged[q];

        return count;
    }
}
