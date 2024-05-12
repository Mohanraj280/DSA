class S {

    int arr[] = new int[5];
    int top = 0;

    public void push(int data) {
        arr[top] = data;
        top++;
    }

    public void pop() {
        top--;
        arr[top] = 0;
    }

    public void peek() {
        System.out.println(arr[top - 1]);
    }

    public void show() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void isEmpty() {
        System.out.println(top <= 0);
    }

    public void size() {
        System.out.println(top);
    }
}

public class Stack {
    public static void main(String[] args) {
        S s = new S();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.push(330);
        s.pop();
        s.peek();
        s.show();
        s.isEmpty();
        s.size();
    }
}
