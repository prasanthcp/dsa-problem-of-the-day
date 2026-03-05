package Arrays.SlidingWindow;

import java.util.Collections;
import java.util.HashMap;

/**
 * Solution class for finding the longest substring with exactly K unique characters.
 */
class LongestSubstringWithKUniques {
    /**
     * Finds the length of the longest substring with exactly K unique characters.
     * Uses a sliding window approach with a HashMap to track character frequencies and indices.
     *
     * @param s the input string
     * @param k the number of unique characters required
     * @return the length of the longest substring with exactly K unique characters, or -1 if not possible
     */
    public int longestKSubstr(String s, int k) {
        // If the string length is less than k, it's impossible to have k unique characters
        if (s.length() < k) {
            return -1;
        }

        int left = 0; // Left pointer of the sliding window
        int right = 0; // Right pointer of the sliding window
        int maxLength = -1; // Maximum length found, initialized to -1
        HashMap<Character, Integer> charIndexMap = new HashMap<>(); // Map to store character and its latest index

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            // If we have less than k unique characters, add the current character
            if (charIndexMap.size() < k) {
                charIndexMap.put(currentChar, right);
            } else if (charIndexMap.size() == k) {
                // If the current character is not in the map, we need to remove the leftmost character
                if (!charIndexMap.containsKey(currentChar)) {
                    // Find the minimum index (leftmost character)
                    int minIndex = Collections.min(charIndexMap.values());
                    char charToRemove = s.charAt(minIndex);
                    // Move the left pointer to the right of the removed character
                    left = minIndex + 1;
                    charIndexMap.remove(charToRemove);
                    // Now add the current character
                    charIndexMap.put(currentChar, right);
                } else {
                    // Update the index of the existing character
                    charIndexMap.put(currentChar, right);
                }
            }

            // If we have exactly k unique characters, update the max length
            if (charIndexMap.size() == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++; // Move the right pointer
        }

        return maxLength;
    }
}