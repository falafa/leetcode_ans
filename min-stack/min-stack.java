class MinStack {
	int min=Integer.MAXVALUE;
	Stack<Integer> stack new Stack<Integer>();
     /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {//元素入栈检查是否为最小
        if(x<min){
			stack.push(min);//妙啊
			min=x;
		}
		stack.push(x);
    }
    
    public void pop() {//元素出栈检查是否影响当前最小
        if(min==stack.pop)min=stack.pop;
    }
	
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */