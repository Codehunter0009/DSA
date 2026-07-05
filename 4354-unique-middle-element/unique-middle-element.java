class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
       int mid=nums.length/2;
        int middle=nums[mid];
    
        for(int i=0;i<nums.length;i++){
            if(nums[i] == middle && i!=mid){
                return false;
            }
        }
        return true;
    }
}