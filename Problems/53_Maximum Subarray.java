//53. Maximum Subarray
class Solution {
    public static int maxSubArray(int[] A) {
        int maximunFound = A[0], maxEnding = A[0];
        for (int i = 1; i < A.length(); i++) {
            maxEnding = Math.max(maxEnding + A[i], A[i]);
            maximunFound = Math.max(maximunFound, maxEnding);
        }
        return maximunFound;
    }
}