package DoubtSession.Assignment2;


// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Ques18g {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for(int i =1; i< prices.length; i++){
            min = Math.min(min, prices[i]);
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}

