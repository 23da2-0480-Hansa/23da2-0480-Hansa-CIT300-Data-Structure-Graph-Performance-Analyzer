public class SearchResult {
    private final boolean found;
    private final int index;
    private final long steps;
    private final long timeNanos;

    public SearchResult(boolean found, int index, long steps, long timeNanos) {
        this.found = found;
        this.index = index;
        this.steps = steps;
        this.timeNanos = timeNanos;
    }

    public void print(String algorithm) {
        System.out.println("\n" + algorithm + " Result");
        System.out.println("--------------------------------");
        System.out.println("Found     : " + found);
        System.out.println("Index     : " + index);
        System.out.println("Steps     : " + steps);
        System.out.println("Time (ns) : " + timeNanos);
    }

    public boolean isFound() { return found; }
    public long getSteps() { return steps; }
    public long getTimeNanos() { return timeNanos; }
}
