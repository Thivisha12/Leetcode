class Solution {
    public int maxProfit(int[] prices) {
        // int buy = prices[0];
        // int profit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < buy) {
        //         buy = prices[i];
        //     } else if (prices[i] - buy > profit) {
        //         profit = prices[i] - buy;
        //     }
        // }
        // return profit;
        int maxprice=0;
        int minvalue=prices[0];
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<minvalue){
                minvalue=prices[i];
            }
            if(prices[i]-minvalue>maxprice){
                maxprice=prices[i]-minvalue;
            }
        }
        return maxprice;

    }
}