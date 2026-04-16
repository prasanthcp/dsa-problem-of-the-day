package Arrays;

/*
Platform: GFG
Problem: Implement Atoi
Category: Strings
Difficulty: Medium
Date: 16-04-2026

Approach:
- Traverse the characters in the String
- Ignore spaces or other characters
- Make note of sign
- When the first digit is found, start traversing till you find an invalid character (non-digit)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int myAtoi(String s) {
        
        long nu = 0; int i = 0, n = s.length();
        boolean sign = true, nufound = false;
        
        while(i<n && !nufound) {
            char c = s.charAt(i);
            
            if(c >= '0' && c <= '9') {
                while(i<n) {
                    c = s.charAt(i);
                    if(c >= '0' && c <= '9') {
                        nu = nu*10 + (int)(c-'0');
                        i++;
                    } else {
                        nufound = true;
                        break;
                    }
                }
            } else {
                if(c=='-') 
                    sign = false;
            }
            
            i++;
        }
        
        if(!sign) nu = -nu;
        
        if(nu > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if(nu < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int)nu;
        
    }
}