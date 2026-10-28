//think of this example: -7,-4,-1,2,3,6,10
//                      | <-------|-------> |
//                 <----Increasing|Increasing --->


class Solution {
    // private void swap(int[]nums,int l,int r){
    //     int temp=nums[l];
    //     nums[l]=nums[r];
    //     nums[r]=temp;
    // }
    public int[] sortedSquares(int[] nums) {
       int[] result=new int[nums.length];
       int head=0;
       int tail=nums.length-1;
       for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
                }
        for(int pos=nums.length-1;pos>=0;pos--){
         if(nums[head]>nums[tail]){
            result[pos]=nums[head];
            head++;
            }
         else{
            result[pos]=nums[tail];
            tail--;
         }
        }
        return result;


    }
}  
    
