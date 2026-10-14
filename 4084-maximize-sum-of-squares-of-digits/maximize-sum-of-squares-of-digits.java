class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // String s=Integer.toString(sum);
        // for(char ch:s.toCharArray()){
        // if(sum>9 && num>0){
        // s.append(9);
        // sum-=9;
        // }
        // else{
        //     s.append(sum);
        // }
        // num--;
        // }

        if(sum>num*9){
            return "";
        }

        StringBuilder ans=new StringBuilder();
        for(int i=0;i<num;i++){
            if(sum>=9){ans.append(9);sum-=9;}
            else{ans.append(sum);sum=0;}
        }
return ans.toString();

    }
}
// 9*num=max sum