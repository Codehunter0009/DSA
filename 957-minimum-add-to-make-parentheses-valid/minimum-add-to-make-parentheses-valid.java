class Solution {
    public int minAddToMakeValid(String s) {
    //     HashMap<Character,Character> map=new HashMap<>();
    //     map.put('(',')');
    //     map.put('[',']');
    //     map.put('{','}');
        
    //     Stack<Character> stack=new Stack<>();
    //     for(char ch:s.toCharArray()){
    //         if(!stack.empty()&& stack.peek()== ch ){stack.pop();}
    //         else if(map.containsKey(ch)){
    //             stack.push(map.get(ch));
    //         }
    //         else {stack.push(ch);}
            
    //     }
    //    return stack.size();

    int open =0;
    int close=0;
    int count=0;
    for(char ch:s.toCharArray()){
        if(ch=='('){open++;}
        else{
            if(open>0){
                open--;
            }
            else{count++;}
        }
    }
return count+open;

    }
}