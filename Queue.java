class Queues {
    int size;
    int arr[] = new int[5];
    int data;
    int front;
    int rear;

    public void enqueue(int data) {
        arr[front] = data;
        front = (front + 1) % 5;
        size++;
    }

    public void dequeue() {
        System.out.print(arr[rear]);
        rear = (rear + 1) % 5;

        size--;
        System.out.println("");
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(rear + i) % 5] + " ");
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        Queues s = new Queues();
        s.enqueue(12);
        s.enqueue(13);
        s.enqueue(14);
        s.enqueue(15);

        s.enqueue(16);
        s.enqueue(17);
        s.enqueue(18);
        s.enqueue(19);
        s.dequeue();
        s.show();
    }
}
