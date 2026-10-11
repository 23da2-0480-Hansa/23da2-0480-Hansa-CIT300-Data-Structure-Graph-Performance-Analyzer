public class CustomStack {
    private final int[] data;
    private int top = -1;

    public CustomStack(int capacity) {
        data = new int[capacity];
    }

    public String push(int value) {
        if (top == data.length - 1) return "Stack overflow. Stack is full.";
        data[++top] = value;
        return "Pushed " + value + ".";
    }

    public String pop() {
        if (top == -1) return "Stack underflow. Stack is empty.";
        return "Popped " + data[top--] + ".";
    }

    public String peek() {
        if (top == -1) return "Stack is empty. Nothing to peek.";
        return "Top value: " + data[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) System.out.print(data[i] + (i == 0 ? "" : " "));
        System.out.println();
    }
}
