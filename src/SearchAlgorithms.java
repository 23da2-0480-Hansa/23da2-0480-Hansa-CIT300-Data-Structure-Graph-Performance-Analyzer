public class SearchAlgorithms {
    public SearchResult linearSearch(int[] data, int target) {
        long steps = 0;
        long start = System.nanoTime();
        for (int i = 0; i < data.length; i++) {
            steps++;
            if (data[i] == target) {
                return new SearchResult(true, i, steps, System.nanoTime() - start);
            }
        }
        return new SearchResult(false, -1, steps, System.nanoTime() - start);
    }

    public SearchResult binarySearch(int[] data, int target) {
        long steps = 0;
        long start = System.nanoTime();
        int low = 0, high = data.length - 1;

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;
            if (data[mid] == target) {
                return new SearchResult(true, mid, steps, System.nanoTime() - start);
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return new SearchResult(false, -1, steps, System.nanoTime() - start);
    }
}
