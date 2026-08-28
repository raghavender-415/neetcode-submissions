class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfit=0;
        while(right<prices.length){
            int buy=prices[left];
            int sell=prices[right];
            if(buy>sell){
                left=right;
                right++;
            }else{
                maxProfit=Math.max(maxProfit,sell-buy);
                right++;
            }
        }
        return maxProfit;
    }
}
