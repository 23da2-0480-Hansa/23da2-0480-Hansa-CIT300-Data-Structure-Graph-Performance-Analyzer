public class PerformanceAnalyzer {
    private final CustomArray array;
    private final CustomStack stack;
    private final CustomQueue queue;
    private final CustomLinkedList list;
    private final SearchAlgorithms search;
    private final Graph graph;

    public PerformanceAnalyzer(CustomArray array, CustomStack stack, CustomQueue queue,
                               CustomLinkedList list, SearchAlgorithms search, Graph graph) {
        this.array = array;
        this.stack = stack;
        this.queue = queue;
        this.list = list;
        this.search = search;
        this.graph = graph;
    }

    public void compareSearches() {
        int[] data = new int[10000];
        for (int i = 0; i < data.length; i++) data[i] = i * 2;
        int target = data[data.length - 1];

        SearchResult linear = search.linearSearch(data, target);
        SearchResult binary = search.binarySearch(data, target);

        System.out.println("\n=============================================");
        System.out.println("        LINEAR VS BINARY SEARCH");
        System.out.println("=============================================");
        System.out.printf("%-18s %-12s %-15s%n", "Algorithm", "Steps", "Time (ns)");
        System.out.println("---------------------------------------------");
        System.out.printf("%-18s %-12d %-15d%n", "Linear Search", linear.getSteps(), linear.getTimeNanos());
        System.out.printf("%-18s %-12d %-15d%n", "Binary Search", binary.getSteps(), binary.getTimeNanos());
        System.out.println("---------------------------------------------");
        System.out.println("Linear Search complexity: O(n)");
        System.out.println("Binary Search complexity: O(log n), requires sorted data.");
    }

    public void showPerformance() {
        System.out.println("\n=============================================");
        System.out.println("          PERFORMANCE COMPARISON");
        System.out.println("=============================================");
        System.out.println("Search       Linear Search     O(n)");
        System.out.println("Search       Binary Search     O(log n)");
        System.out.println("Graph        BFS               O(V + E)");
        System.out.println("Graph        DFS               O(V + E)");
        System.out.println("Array        Search            O(n)");
        System.out.println("Stack        Push/Pop/Peek     O(1)");
        System.out.println("Queue        Enqueue/Dequeue   O(1) average");
        System.out.println("Linked List  Search            O(n)");
        System.out.println("Linked List  Insert at end     O(n) in this implementation");
        System.out.println("=============================================");
        System.out.println("Note: Actual execution time varies by machine and JVM.");
    }

    public void showAllResults() {
        System.out.println("\n=============================================");
        System.out.println("              ALL RESULTS");
        System.out.println("=============================================");
        array.display();
        stack.display();
        queue.display();
        list.display();
        System.out.println("Graph vertices: " + graph.vertices());
        System.out.println("Run option 7 for complexity/performance comparison.");
    }
}
