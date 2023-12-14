package archived;

class MinStack {
    Stack<Integer> main_stack;
    Stack<Integer> min_stack;
    public MinStack(){
        main_stack = new Stack<Integer>();
        min_stack  = new Stack<Integer>();
    }
    public void push(int x) {
        if(main_stack.empty() == true){
            main_stack.push(x);
            min_stack.push(x);
        }
        else{
            int min = getMin();
            if(x <= min){
                main_stack.push(x);
                min_stack.push(x);
            }
            else
                main_stack.push(x);
        }
    }

    public void pop() {
        int top_element = top();
        int min_element = getMin();
        if(top_element == min_element){
            main_stack.pop();
            min_stack.pop();
        }
        else
            main_stack.pop();
    }

    public int top() {
        return main_stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}

