class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int length = tokens.length;
        for(int i = 0; i < length; i++){
            String ch = tokens[i];
            if(ch.equals("+")){
                int top = stack.pop();
                int newTop = stack.pop();
                int result = top+newTop;
                stack.push(result);
            }else if(ch.equals("-")){
                int top = stack.pop();
                int newTop = stack.pop();
                int result = newTop-top;
                stack.push(result);
            }else if(ch.equals("*")){
                int top = stack.pop();
                int newTop = stack.pop();
                int result = top*newTop;
                stack.push(result);
            }else if(ch.equals("/")){
                int top = stack.pop();
                int newTop = stack.pop();
                int result = newTop/top;
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.peek();
    }
}