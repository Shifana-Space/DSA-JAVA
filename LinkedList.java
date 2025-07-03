class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head, tail;

    public void insert(int data) {
        Node n = new Node(data);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public void display() {
        if (head == null)
            System.out.println("List Empty");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void insertBeg(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertAt(int pos, int data) {
        Node n = new Node(data);

        if (pos == 0) {
            n.next = head;
            head = n;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        n.next = temp.next;
        temp.next = n;
    }

    public void deleteBeg() {
        if (head == null) return;
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void deleteAt(int pos) {
        if (head == null || pos == 0) {
            deleteBeg();
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
    }
}

public class LinkedList{
    public static void main(String args[]) {
        LinkedList l = new LinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        
        l.insertBeg(5);
        l.insertAt(2,35);
        
        System.out.println("After deletion at end");
        l.deleteEnd();
        l.display();

        System.out.println("After deletion at specified position");
        l.deleteAt(2);
        l.display();
    }
}
