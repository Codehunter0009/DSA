class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int balance=0;
    for(char ch:s.toCharArray()){
        if(ch=='('){
        balance++;
        if(balance>1){sb.append(ch);}
        }
        else if(ch==')'){
            balance--;
            if(balance>0){
                sb.append(ch);
            }
        }

    }
    return sb.toString();
   
    }
}