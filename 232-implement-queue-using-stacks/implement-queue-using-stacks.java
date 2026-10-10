class MyQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
        
        
    }
    
    public int pop() {
        int pop=0;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
            
        }pop= stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }
    
    public int peek() {
        int peek=0;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
            
        }peek= stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */