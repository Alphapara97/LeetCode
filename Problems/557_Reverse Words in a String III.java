//Runtime: 3 ms, faster than 97.12% of Java online submissions for Reverse Words in a String III.
class Solution {
    public String reverseWords(String s) {
        int i = 0, j = 0;
        int n = s.length();
        char[] words = s.toCharArray();
        while (i < n && j < n) {
            while (i < n && words[i] == ' ') {
                i++;
            }
            j = i;
            while (j < n && words[j] != ' ') {
                j++;
            }
            reverse(words, i, j - 1);
            i = j;
        }
        return new String(words);
    }

    private void reverse(char[] words, int s, int t) {
        while (s < t) {
            char tmp = words[s];
            words[s] = words[t];
            words[t] = tmp;
            s++;
            t--;
        }
    }
}