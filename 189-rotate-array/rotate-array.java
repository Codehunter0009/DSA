class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
        k = k % n;
        // reverse the entire array
        Reverse(nums,0,n-1);
       //reverse the first k elements 
        Reverse(nums,0,k-1);
        //reverse the last n-k elements
        Reverse(nums,k,n-1);

    }
    void Reverse(int []nums,int s,int e){
        while(e>s){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}