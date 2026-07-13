// class Solution {
//     public long maxAlternatingSum(int[] nums) {
//         int evsum=0;
//         for(int i=0;i<nums.length;i++){
//             nums[i]*=nums[i];
//         }
//         Arrays.sort(nums);
//         if(n%2==0){
//             for(n=0;n=n/2;n++){
//                 evsum=evsum+nums[n];
//             }
//             while(n>n/2){
//                 evsum=evsum-nums[n];
//             }
//         }
//         if(n%2!=0){
//              for(n=0;n=n/2;n++){
//                 evsum=evsum+nums[n];
//             }
//             while(n>n/2){
//                 evsum=evsum-nums[n];
//             }
        
//         }
        
//         return nums;
//     }
// }
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        long[] sq = new long[n];

        for (int i = 0; i < n; i++) {
            sq[i] = 1L * nums[i] * nums[i];
        }

        Arrays.sort(sq);

        long ans = 0;

        // subtract smallest floor(n/2)
        for (int i = 0; i < n / 2; i++) {
            ans -= sq[i];
        }

        // add largest ceil(n/2)
        for (int i = n / 2; i < n; i++) {
            ans += sq[i];
        }

        return ans;
    }
}