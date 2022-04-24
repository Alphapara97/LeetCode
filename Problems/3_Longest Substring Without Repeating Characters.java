//the logic is to  keep a hashmap which stores the characters in string as keys and their positions
// as values, and keep two pointers which define the max substring. Then we move the right pointer to scan
// through the string , and meanwhile update the hashmap. If the character is already in the hashmap,
// then move the left pointer to the right of the same character last found. Note that the two pointers
// can only move forward.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}