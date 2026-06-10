class Solution {
    public int maxSubArray(int[] nums) {
        int mx=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            mx=Math.max(mx+nums[i],nums[i]);
            res=Math.max(res,mx);
        }
        return res;
    }
}
