class myStack {
    int[] arr;
    int top;
    int N;

    public myStack(int n) {
        N = n;
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == N - 1;
    }

    public void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    public int peek() {
        if (isEmpty()) return -1;
        return arr[top];
    }
}
