class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        allperm(ans,"",n);
        return ans;
    }
    void allperm(List<String>ans,String curr,int n ){
        if(curr.length()==2*n){
            if(isValid(curr)){
            ans.add(curr);
            }
            return;
        }
       allperm(ans,curr+'(',n);
       allperm(ans,curr+')',n);
    }

    boolean isValid(String s){
        int balance=0;
       for(char c:s.toCharArray()){
        if(c=='('){balance++;}
        else{balance--;}
        if (balance<0){return false;}
        }
        return balance==0;
    }
}