// Subsequence: Any sequence of characters in a string where their relative order is maintained.


class Solution {
    public int removePalindromeSub(String s) {
        if (s.equals(new StringBuilder(s).reverse().toString())) return 1;
        return 2;
    }
}