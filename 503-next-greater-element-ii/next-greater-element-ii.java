class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int nge=-1;
        int []ans=new int[nums.length];
       
        for(int i=0;i<nums.length;i++){
             ans[i]=-1;
            for(int j=i+1;j<i+nums.length;j++){
                int ind=j%nums.length;
                if(nums[ind]>nums[i]){
                    ans[i]=nums[ind];
                    break;
                }
            }

        }
        return ans;
    }
}