import java.util.Scanner;

class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = head;
        this.tail = tail;
        this.size = 0;
    }

    public void insertAtBeginning(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtBeginning(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteAt() {
        int val = head.val;

        if (head == null) {
            tail = null;
        }
        head = head.next;
        size--;
        return val;
    }

    public int deleteAtEnd() {
        int val = tail.val;
        Node temp = get(size - 2);

        if (size <= 1) {
            return deleteAt();
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAtPosition(int index) {

        if (index == 0) {
            return deleteAt();
        }
        if (index == size - 1) {
            return deleteAtEnd();
        }
        Node temp = get(index - 1);
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAtPosition(int val, int index) {
        if (index == 0) {
            insertAtBeginning(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = get(index - 1);
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    static class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        Scanner s = new Scanner(System.in);
        while (true) {
            int data = s.nextInt();
            if (data == -1) {
                break;
            }
            lst.insertAtBeginning(data);
        }
        // lst.display();
        // System.out.println(lst.deleteAt());
        // lst.display();
        // System.out.println(lst.deleteAtPosition(3));
        System.out.println(lst.find(28));
        System.out.println(lst.find(29));
        System.out.println(lst.deleteAt());
        lst.insertAtPosition(12, 2);
        lst.display();
    }
}
