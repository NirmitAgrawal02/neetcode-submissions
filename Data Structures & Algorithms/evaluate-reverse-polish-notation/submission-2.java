class Solution {
    public int evalRPN(String[] tokens) {
        HashSet<String> operands = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        int val = 0;
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens)
        {  
                if(token.equals("+"))
                {
                    stack.push(stack.pop() + stack.pop());
                }
                else if(token.equals("-"))
                {
                    int a = stack.pop();
                    stack.push(stack.pop() - a);
                }
                else if(token.equals("*"))
                {
                    stack.push(stack.pop() * stack.pop());
                }
                else if(token.equals("/"))
                {
                    int a  = stack.pop();

                    stack.push(stack.pop() / a);
                }
                else
                {
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }   
    }
