class Solution {
    public long removeZeros(long n) {
        long ans=0;
        long place=1;
       
       while(n>0){
        long rem = n % 10;
        if(rem!=0){
            
            ans=rem*place+ans;
            place=place*10;
        }
        n/=10;


       }
       return ans;
    }
}