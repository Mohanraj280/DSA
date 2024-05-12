class S {
    int capacity = 2;
    int arr[] = new int[capacity];
    int top = 0;

    public void push(int data) {

        if (size() == capacity)
            expand();
        arr[top] = data;
        top++;
    }

    public void expand() {
        int length = size();
        int news[] = new int[capacity * 2];
        System.arraycopy(arr, 0, news, 0, length);
        arr = news;
        capacity *= 2;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
        arr[top] = 0;
        shrink();
    }

    public void shrink() {
        int length = size();

        if (length <= (capacity / 2) / 2) {
            capacity = capacity / 2;
        }
        int a[] = new int[capacity];
        System.arraycopy(arr, 0, a, 0, length);
        arr = a;

    }

    public void peek() {
        System.out.println(arr[top - 1]);
    }

    public void show() {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public int size() {
        return top;
    }
}

public class DStack {
    public static void main(String[] args) {
        S s = new S();
        s.push(10);
        s.push(20);
        s.push(13);
        s.push(120);
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();
    }
}
