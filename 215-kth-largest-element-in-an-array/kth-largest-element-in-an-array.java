class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
         int maxel=0;
        for(int i=0;i<nums.length;i++){pq.add(nums[i]);}
        while(k>1){
            pq.poll();
            k--;
        }
        maxel= pq.poll();
        // for(int j=k;j<nums.length;j++){

        
        

return maxel;
    }
}