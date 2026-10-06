class Solution {
    Boolean [][]memo;
    public boolean checkValidString(String s) {
//         int n=s.length();
//         int open=0;
//         int close=0;
//         for(char ch:s.toCharArray()){
//             if( ch =='(' || ch == '*'){open++;}
//             else{
//                 open--;

//             }
//             if(open<0){return false;}

//         }
         
//          for(int i=n-1;i>=0;i--){
//             if(s.charAt(i)==')'||s.charAt(i)=='*'){close++;}
//             else{
//                 close--;

//             }
//             if(close<0){return false;}
//          }
// return true;

    memo=new Boolean[s.length()][s.length()+1];
    return solve(s,0,0);
    
    }
    public boolean solve(String s,int index,int balance){
        if(balance<0){return false;}
        //all characters are processed
        if(index==s.length()){return balance==0;}
        
        //aldready calculated
        if(memo[index][balance]!=null){return memo[index][balance];}
        char currentCharacter=s.charAt(index);
        boolean result;

        //case1:opening bracket
        if(currentCharacter=='('){
            result= solve(s,index+1,balance+1);
        }
        //case 2:closing bracket
        else if(currentCharacter==')'){
            result= solve(s,index+1,balance-1);
        }else{
    //case 3:* as'(''
    boolean useAsOpening= solve(s,index+1,balance+1);
    boolean useAsClosing=solve(s,index+1,balance-1);
    boolean useAsEmpty= solve(s,index+1,balance);
    result= useAsOpening || useAsClosing ||useAsEmpty;
    }
    memo[index][balance]=result;
    return result;

}

}