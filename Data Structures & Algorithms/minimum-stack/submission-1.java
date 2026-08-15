class MinStack {
    Stack<Integer> stack;
    TreeSet<Integer> tree;
    HashMap<Integer, Integer> count;
    public MinStack() {
        stack = new Stack<>();
        tree = new TreeSet<>();
        count = new HashMap<>();
    }
    
    public void push(int val) {
        stack.push(val);
        tree.add(val);
        count.put(val, count.getOrDefault(val, 0) + 1);
        return;
    }
    
    public void pop() {
        int val = stack.pop();
        count.put(val, count.get(val) - 1);
        if(count.get(val) < 1)
        {
            tree.remove(val);
        }
    }
    
    public int top() {

        return stack.peek();
    }
    
    public int getMin() {
        return tree.first();
    }
}
