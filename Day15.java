import java.util.*;

class Day15 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            if (seen.containsKey(s.charAt(right)) && seen.get(s.charAt(right)) >= left) {
                left = seen.get(s.charAt(right)) + 1; 
            }
            seen.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        Day15 sol = new Day15();
        System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); 
    }
}
