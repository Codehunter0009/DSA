class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        for(int i=0;i<s.length();i++){
            
            
               if(map.containsKey(s.charAt(i))){stack.push(map.get(s.charAt(i)));}
            else{
                 if(stack.isEmpty() || stack.peek() != s.charAt(i)) {
                    return false;
                }
                stack.pop();
            }
           
        }
         return stack.isEmpty();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
        //         stack.push(s.charAt(i));
        //     }
        //     else{
        //         if(stack.isEmpty())return false;
        //         char ch=stack.peek();
        //         if(s.charAt(i)==')'&& ch=='('|| 
        //            s.charAt(i)=='}'&& ch=='{'||
        //            s.charAt(i)==']'&&ch=='['){
        //         stack.pop();

        //     }
        //     else{
        //         return false;
        //     }
        //     }

        // }
        // return stack.isEmpty();
    }
}