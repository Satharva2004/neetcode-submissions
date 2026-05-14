class MinStack {
    Stack<Integer> stack;
    Stack<Integer> MinStack;
    public MinStack() {
        stack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty() || MinStack.peek() >= val){
            MinStack.push(val);
        }
    }
    
    public void pop() {
        int peektemp = stack.pop();
        if(peektemp == MinStack.peek()){
            MinStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}
