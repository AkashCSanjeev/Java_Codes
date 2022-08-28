import java.util.ArrayList;

public class DepthFirstSearch {

    static void dfs(ArrayList<ArrayList<Integer>> graph, int noOfVertex, int startVertex) {

        ArrayList<Integer> dfs = new ArrayList<>();
        boolean visited[] = new boolean[noOfVertex + 1];

        visited[startVertex] = true;
        depth(startVertex, visited, graph, dfs);

        System.out.println(dfs);

    }

    static void depth(int node, boolean visited[], ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (Integer i : graph.get(node)) {
            if (visited[i] == false) {
                depth(i, visited, graph, dfs);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            graph.add(new ArrayList<Integer>());

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(5).add(2);
        graph.get(2).add(5);

        graph.get(6).add(2);
        graph.get(2).add(6);

        graph.get(3).add(7);
        graph.get(7).add(3);

        graph.get(3).add(4);
        graph.get(4).add(3);

        graph.get(7).add(8);
        graph.get(8).add(7);

        graph.get(8).add(4);
        graph.get(4).add(8);

        dfs(graph, 8, 1);
    }
}
