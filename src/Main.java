import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CustomArray array = new CustomArray(20);
    private static final CustomStack stack = new CustomStack(20);
    private static final CustomQueue queue = new CustomQueue(20);
    private static final CustomLinkedList linkedList = new CustomLinkedList();
    private static final SearchAlgorithms search = new SearchAlgorithms();
    private static final Graph graph = new Graph();
    private static final PerformanceAnalyzer performance = new PerformanceAnalyzer(
            array, stack, queue, linkedList, search, graph);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("=============================================");
        System.out.println(" DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("=============================================");

        while (running) {
            showMainMenu();
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> arrayMenu();
                case 2 -> stackMenu();
                case 3 -> queueMenu();
                case 4 -> linkedListMenu();
                case 5 -> searchMenu();
                case 6 -> graphMenu();
                case 7 -> performance.showPerformance();
                case 8 -> performance.showAllResults();
                case 9 -> {
                    running = false;
                    System.out.println("Thank you. Program closed.");
                }
                default -> System.out.println("Invalid choice. Please enter 1-9.");
            }
        }
        scanner.close();
    }

    private static void showMainMenu() {
        System.out.println("\n=============================================");
        System.out.println("              MAIN MENU");
        System.out.println("=============================================");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
        System.out.println("=============================================");
    }

    private static void arrayMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- ARRAY OPERATIONS ---------------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    int value = InputHelper.readInt(scanner, "Enter value: ");
                    int index = InputHelper.readInt(scanner, "Enter index (0-" + array.size() + "): ");
                    System.out.println(array.insert(index, value));
                }
                case 2 -> {
                    int index = InputHelper.readInt(scanner, "Enter index to delete: ");
                    System.out.println(array.delete(index));
                }
                case 3 -> {
                    int value = InputHelper.readInt(scanner, "Enter value to search: ");
                    int result = array.search(value);
                    System.out.println(result >= 0 ? "Found at index " + result : "Value not found.");
                }
                case 4 -> array.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void stackMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- STACK OPERATIONS ---------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> System.out.println(stack.push(InputHelper.readInt(scanner, "Enter value: ")));
                case 2 -> System.out.println(stack.pop());
                case 3 -> System.out.println(stack.peek());
                case 4 -> stack.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void queueMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- QUEUE OPERATIONS ---------------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek/Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> System.out.println(queue.enqueue(InputHelper.readInt(scanner, "Enter value: ")));
                case 2 -> System.out.println(queue.dequeue());
                case 3 -> System.out.println(queue.peek());
                case 4 -> queue.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void linkedListMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n------------ LINKED LIST OPERATIONS ------------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> System.out.println(linkedList.insert(InputHelper.readInt(scanner, "Enter value: ")));
                case 2 -> System.out.println(linkedList.delete(InputHelper.readInt(scanner, "Enter value to delete: ")));
                case 3 -> System.out.println(linkedList.search(InputHelper.readInt(scanner, "Enter value to search: "))
                        ? "Value found." : "Value not found.");
                case 4 -> linkedList.display();
                case 5 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void searchMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n------------- SEARCHING OPERATIONS -------------");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Compare Linear vs Binary");
            System.out.println("4. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> {
                    int[] data = InputHelper.readArray(scanner);
                    int target = InputHelper.readInt(scanner, "Target: ");
                    SearchResult r = search.linearSearch(data, target);
                    r.print("Linear Search");
                }
                case 2 -> {
                    int[] data = InputHelper.readSortedArray(scanner);
                    int target = InputHelper.readInt(scanner, "Target: ");
                    SearchResult r = search.binarySearch(data, target);
                    r.print("Binary Search");
                }
                case 3 -> performance.compareSearches();
                case 4 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void graphMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\n--------------- GRAPH OPERATIONS --------------");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");
            int choice = InputHelper.readInt(scanner, "Enter your choice: ");

            switch (choice) {
                case 1 -> System.out.println(graph.addVertex(InputHelper.readString(scanner, "Vertex name: ")));
                case 2 -> {
                    String from = InputHelper.readString(scanner, "From vertex: ");
                    String to = InputHelper.readString(scanner, "To vertex: ");
                    System.out.println(graph.addEdge(from, to));
                }
                case 3 -> graph.display();
                case 4 -> graph.bfs(InputHelper.readString(scanner, "Start vertex: "));
                case 5 -> graph.dfs(InputHelper.readString(scanner, "Start vertex: "));
                case 6 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
