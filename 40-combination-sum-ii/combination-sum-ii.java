/*class Solution {
    private void combination(int ind,int arr[],int target,Set<List<Integer>> ans,List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
               ans.add(new ArrayList<>(ds));
            }
            return;
        }
    if(arr[ind]<=target){
    ds.add(arr[ind]);
    combination(ind+1,arr,target-arr[ind],ans,ds);
    ds.remove(ds.size()-1);

        }
        combination(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,ans,new ArrayList<>()); 
        return new ArrayList <>(ans);
    }
}
*/
class Solution {
    private void combination(int ind,int arr[],int target,List<List<Integer>> ans,List<Integer> ds){
     
            if(target==0){
               ans.add(new ArrayList<>(ds));
                return;
            }
            
           
        
         for(int i=ind;i<arr.length;i++){
         if(i>ind && arr[i]==arr[i-1]) {continue;}
            if(arr[i]>target) {break;}
                ds.add(arr[i]);
                combination(i+1,arr,target-arr[i],ans,ds);
                ds.remove(ds.size()-1);
            
          } }

        
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,target,ans,new ArrayList<>()); 
        return new ArrayList <>(ans);
    }
}




