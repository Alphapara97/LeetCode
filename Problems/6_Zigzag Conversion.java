class Solution {
    public String convert(String s, int numRows) {
        int i,j;
        if(numRows == 1){
            return s;
        }
        int step = 2*numRows -2;
        StringBuilder result  = new StringBuilder();
        for(i=0;i<numRows;i++){
            for(j=i;j<s.length();j+=step){
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }

        }
        return result.toString();
    }
}

//Runtime: 6 ms, faster than 80.17% of Java online submissions for Zigzag Conversion.
//https://www.youtube.com/watch?v=Q2Tw6gcVEwc
