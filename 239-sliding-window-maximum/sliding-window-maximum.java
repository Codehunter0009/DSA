class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []result=new int[nums.length-k+1];
        Deque<Integer> dequeue=new LinkedList<>();
        for(int right=0;right<nums.length;right++){
            while(!dequeue.isEmpty()&&dequeue.peekFirst()<=right-k){
                dequeue.pollFirst();
            }
            while(!dequeue.isEmpty()&&nums[dequeue.peekLast()]<nums[right]){
                dequeue.pollLast();
            }
            dequeue.addLast(right);
            if(right>=k-1){
                result[right-k+1]=nums[dequeue.peekFirst()];
            }
        }
    return result;
    }
}