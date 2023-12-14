package archived;

class StackUsingQueues {
    // Push element x onto stack.
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack(){
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    public void push(int x) {
        if(q1.size() == 0)
            q2.add(x);
        else
            q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(q1.size() == 1)
            q1.poll();
        else if(q2.size() == 1)
            q2.poll();
        else if(q1.size() != 0){
            while(q1.size() != 1){
                int x = q1.poll();
                q2.add(x);
            }
            q1.poll();
        }
        else{
            while(q2.size() != 1){
                int x = q2.poll();
                q1.add(x);
            }
            q2.poll();
        }
    }

    // Get the top element.
    public int top() {
        if(q1.size() == 1)
            return q1.peek();
        else if(q2.size() == 1)
            return q2.peek();
        else if(q1.size() != 0){
            int x = 0;
            while(q1.size() != 0){
                x = q1.poll();
                q2.add(x);
            }
            return x;
            
        }
        else{
            int x = 0;
            while(q2.size() != 0){
                x = q2.poll();
                q1.add(x);
            }
            return x;
        }
        
    }
    

    // Return whether the stack is empty.
    public boolean empty() {
     if(q1.size() == 0 && q2.size() == 0)
        return true;
    return false;
    }
}

