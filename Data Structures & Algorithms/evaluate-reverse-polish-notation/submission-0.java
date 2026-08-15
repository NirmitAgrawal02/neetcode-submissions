class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens)
        {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            {
                int a = stack.pop();
                int b = stack.pop();
                if(s.equals("+"))
                {
                    b = b + a;
                    stack.push(b);
                }
                if(s.equals("-"))
                {
                    b = b - a;
                    stack.push(b);
                }
                if(s.equals("*"))
                {
                    b = b * a;
                    stack.push(b);
                }
                if(s.equals("/"))
                {
                    b = b / a;
                    stack.push(b);
                }
            }
            else
            {
                int val = Integer.parseInt(s);
                stack.push(val);
            }
        }
        return stack.pop();
    }
}
