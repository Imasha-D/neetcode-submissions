class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastSeen = new int[128];
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);

            // Directly jump the left pointer.
            // If the character hasn't been seen, lastSeen[currChar] will be 0.
            left = Math.max(lastSeen[currChar], left);

            // Store right + 1 so that 0 remains the default "never seen" flag
            lastSeen[currChar] = right + 1;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
        
    }
}
