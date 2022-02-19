//121. Best Time to Buy and Sell Stock
class Solution {
        public int maxProfit(int[] prices) {
                int min = prices[0], max = 0;
                for(int i = 0 ; i<prices.length;i++){
                        if(prices[i]>min){
                                max = Math.max(max,prices[i]-min);
                                System.out.println(max);
                        }else{
                                min = prices[i];
                        }
                }
                return max;
        }
}
// Best approach
public class Solution {
        public int maxProfit(int prices[]) {
                int minprice = Integer.MAX_VALUE;
                int maxprofit = 0;
                for (int i = 0; i < prices.length; i++) {
                        if (prices[i] < minprice)
                                minprice = prices[i];
                        else if (prices[i] - minprice > maxprofit)
                                maxprofit = prices[i] - minprice;
                }
                return maxprofit;
        }
}
