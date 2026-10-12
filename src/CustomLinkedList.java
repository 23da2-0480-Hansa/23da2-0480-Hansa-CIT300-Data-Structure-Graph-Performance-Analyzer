public class CustomLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public String insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        return "Inserted " + value + " into linked list.";
    }

    public String delete(int value) {
        if (head == null) return "Linked list is empty.";
        if (head.data == value) {
            head = head.next;
            return "Deleted " + value + ".";
        }
        Node current = head;
        while (current.next != null && current.next.data != value) current = current.next;
        if (current.next == null) return "Value not found.";
        current.next = current.next.next;
        return "Deleted " + value + ".";
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        System.out.print("Linked List: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }
}
