class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans=new int [temperatures.length];
        Stack<Integer> stack=new Stack<>();
        int idx=0;
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty()&& temperatures[i]>temperatures[stack.peek()]){
                idx=stack.pop();
                ans[idx]=i-idx;
            }
            stack.push(i);
        }
        return ans;
    }
}