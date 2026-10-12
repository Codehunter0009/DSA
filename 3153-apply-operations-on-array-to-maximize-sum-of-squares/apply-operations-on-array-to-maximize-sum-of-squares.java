class Solution {
    public int maxSum(List<Integer> nums, int k) {
    //   int left=0;int right=nums.length;
    //   int maxi=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j =i+1;j<numslength;i++){
    //            int a =nums[i];
    //            int b=nums[j];
    //            nums[i]=a&b;
    //            nums[j]=a||b;
    //         }
    //     }
    //     i=0;j=0;
    //     while(k!=0){
    //             maxi=Math.max(max,nums[i]*nums[i]+nums[j]*nums[j]);
    //             k--;
    //             i++;
    //             j--;
    //            }
    
    int []bitCount =new int[30];
    long ans=0;int mod=1000000007;

    for(int num:nums){
        for(int bit=0;bit<30;bit++ ){
            if( (num & (1<<bit)) !=0){
                bitCount[bit]++;
            }
        }
    }
    long sum=0;
    //construct the k maximum numbers
    for(int i=0;i<k;i++){
        long num=0;
        for(int bit=0;bit<30;bit++){
            if(bitCount[bit]>0){
                num|=(1L<<bit);
                bitCount[bit]--;
            }
        }

        //add the square
        sum=(sum + num*num)%mod;
    }
    return (int) sum;
    
    
    
    
    
    
    
    
    
    
    
    }
}