class Solution {
    public String removeTrailingZeros(String num) {
        //int number=Integer.ParseInt(num);
        char[] nums=num.toCharArray();
        int n=nums.length-1;
    while(n>0 && nums[n]=='0'){
        n--;
     }
     return new String(nums,0,n+1) ;    
     //return new String(char[] value, int offset, int count) where count==length
    }
}