class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
     List<List<Integer>> ans =new ArrayList<>();
     recur(0,nums,ans);
     return ans; 
    }
    private void recur(int ind,int[] nums,List<List<Integer>>ans){
        if(ind==nums.length){
           List<Integer> ds=new ArrayList<>();
           for(int i=0;i<nums.length;i++){
            ds.add(nums[i]);
           }
           ans.add(new ArrayList<>(ds));
        }
        HashSet<Integer> used = new HashSet<>();

        for(int i=ind;i<nums.length;i++){
             if (used.contains(nums[i])) {
                continue;
            }

            used.add(nums[i]);
            swap(i,ind,nums);
            recur(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    private void swap(int i,int ind,int[] nums){
        int temp=nums[ind];
        nums[ind]=nums[i];
        nums[i]=temp;
    }
}