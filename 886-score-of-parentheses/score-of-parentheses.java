class Solution {
    public int scoreOfParentheses(String s) {
        // int count=0;
        // int pair=0;
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){count++;}
        //     else{
        //         if(count>0){
        //         count--;
        //         pair++;
        //         }
                
        //     }
        // }
        // return pair;

    Stack<Integer> stack=new Stack<>();
    stack.push(0);
    int a=0;
    int b=0;
    int top=0;
    stack.push(0);
    for(char ch: s.toCharArray()){
        if(ch =='('){ 
            stack.push(0);
        }
        else{
            top=stack.pop();
            a=Math.max(2*top,1);
            b=stack.pop();
            stack.push(a+b);
        }
        

    }
        return stack.pop();
    }
}