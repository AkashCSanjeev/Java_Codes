import java.util.Arrays;

class Prims {

    static void prims(int graph[][], int vertex) {
        int mst[] = new int[vertex];
        int key[] = new int[vertex];
        boolean visited[] = new boolean[vertex];
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(mst, -1);
        Arrays.fill(visited, false);

        key[0] = 0;

        for (int i = 0; i < vertex; i++) {
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for (int j = 0; j < vertex; j++) {
                if ((key[j] < min) && (visited[j] == false)) {
                    min = key[j];
                    min_index = j;
                }
            }

            visited[min_index] = true;

            for (int k = 0; k < vertex; k++) {

                if (graph[min_index][k] != 0 && visited[k] == false && graph[min_index][k] < key[k]) {
                    mst[k] = min_index;
                    key[k] = graph[min_index][k];
                }

            }

        }
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mst));
        System.out.println(Arrays.toString(key));
    }

    public static void main(String[] args) {

        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

        prims(graph, 9);

    }
}