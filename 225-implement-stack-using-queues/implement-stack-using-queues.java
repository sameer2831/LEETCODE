class MyStack {
    Queue<Integer> que;
    public MyStack() {
        que=new LinkedList<>();
    }
    
    public void push(int x) {
        que.offer(x);
        for(int i=0;i<que.size()-1;i++) que.add(que.remove());
    }
    
    public int pop() {
        if(!que.isEmpty()) return que.remove();
        else return -1;
    }
    
    public int top() {
        if(!que.isEmpty()) return que.peek();
        else return -1;
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */