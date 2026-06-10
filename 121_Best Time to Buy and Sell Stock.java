class Solution {
    public int maxProfit(int[] prices) {
        int i,mn=prices[0],res=0;
        for(i=1;i<prices.length;i++){
            mn=Math.min(mn,prices[i]);
            res=Math.max(res,prices[i]-mn);
        }
        return res;
    }
}
