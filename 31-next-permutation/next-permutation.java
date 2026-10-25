class Solution {
    public void nextPermutation(int[] nums) {
       int ind=nums.length-2;
       while(ind>=0 && nums[ind]>=nums[ind+1]){
            ind--;
       }
       if(ind>=0){
        int j=nums.length-1;
        while(j>=0 && nums[j]<=nums[ind])j--;
       swap(nums,ind,j);
       }
       reverse(nums,ind+1);
    }
    public void swap(int[] nums,int ind,int j){
        int temp=nums[ind];
        nums[ind]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] nums,int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}

// 1. find the 1st increasing element from the end where others are increasing
// 2. swap it with the next greatest number
// 3. reverse the remainig array in sorted order in decreasing order