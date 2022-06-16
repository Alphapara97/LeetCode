class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String numb1[] = num1.split("\\+|i");
        String numb2[] = num2.split("\\+|i");

        int a = Integer.parseInt(numb1[0]);
        int b = Integer.parseInt(numb1[1]);
        int c = Integer.parseInt(numb2[0]);
        int d = Integer.parseInt(numb2[1]);

        return String.format("%d+%di",(a*c-b*d),(b*c+a*d));

    }
}