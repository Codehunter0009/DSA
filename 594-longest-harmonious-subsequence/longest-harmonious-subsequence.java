class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }  
        }
        int res=0;
        for(int num:map.keySet()){
            if(map.containsKey(num+1)){
                res=Math.max(res,map.get(num)+map.get(num+1));
            }
        }
        return res;
    }
}



// int n=nums.length;
//         int max=0;
//         Arrays.sort(nums);
//         while(r<n){
//             while(nums[r]-nums[l]>1){
//                 l++;
//             }
//             if(nums[r]-nums[l]==1){
//                 max=Math.max(max,r-l+1);
//                 r++;
//             }

//         }
       

        
//          return max;