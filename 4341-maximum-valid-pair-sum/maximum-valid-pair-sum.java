class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        
        int maxleft=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int i=k;i<nums.length;i++){
           maxleft=Math.max(maxleft, nums[i-k]);
            ans=Math.max(ans,maxleft+nums[i]);
        }
        return ans;
    }
}