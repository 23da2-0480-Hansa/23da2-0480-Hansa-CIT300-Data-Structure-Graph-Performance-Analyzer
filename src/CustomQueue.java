public class CustomQueue {
    private final int[] data;
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public CustomQueue(int capacity) {
        data = new int[capacity];
    }

    public String enqueue(int value) {
        if (size == data.length) return "Queue is full.";
        rear = (rear + 1) % data.length;
        data[rear] = value;
        size++;
        return "Enqueued " + value + ".";
    }

    public String dequeue() {
        if (size == 0) return "Queue underflow. Queue is empty.";
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return "Dequeued " + value + ".";
    }

    public String peek() {
        if (size == 0) return "Queue is empty. Nothing to peek.";
        return "Front value: " + data[front];
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.print(data[index] + (i == size - 1 ? "" : " "));
        }
        System.out.println();
    }
}
