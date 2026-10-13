import java.util.*;

public class Graph {
    private final Map<String, List<String>> adjacencyList = new LinkedHashMap<>();

    public String addVertex(String vertex) {
        if (adjacencyList.containsKey(vertex)) return "Vertex already exists.";
        adjacencyList.put(vertex, new ArrayList<>());
        return "Added vertex: " + vertex;
    }

    public String addEdge(String from, String to) {
        if (!adjacencyList.containsKey(from) || !adjacencyList.containsKey(to)) {
            return "Both vertices must exist before adding an edge.";
        }
        if (!adjacencyList.get(from).contains(to)) adjacencyList.get(from).add(to);
        if (!adjacencyList.get(to).contains(from)) adjacencyList.get(to).add(from);
        return "Added edge: " + from + " <-> " + to;
    }

    public void display() {
        if (adjacencyList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        System.out.println("Adjacency List:");
        for (Map.Entry<String, List<String>> entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void bfs(String start) {
        if (!adjacencyList.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return;
        }
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        long steps = 0;

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            steps++;
            System.out.print(current + " ");
            for (String neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println("\nBFS steps: " + steps);
    }

    public void dfs(String start) {
        if (!adjacencyList.containsKey(start)) {
            System.out.println("Start vertex not found.");
            return;
        }
        Set<String> visited = new LinkedHashSet<>();
        long[] steps = {0};
        System.out.print("DFS: ");
        dfsRecursive(start, visited, steps);
        System.out.println("\nDFS steps: " + steps[0]);
    }

    private void dfsRecursive(String current, Set<String> visited, long[] steps) {
        visited.add(current);
        steps[0]++;
        System.out.print(current + " ");
        for (String neighbour : adjacencyList.get(current)) {
            if (!visited.contains(neighbour)) dfsRecursive(neighbour, visited, steps);
        }
    }

    public int vertexCount() { return adjacencyList.size(); }
    public Set<String> vertices() { return adjacencyList.keySet(); }
}
