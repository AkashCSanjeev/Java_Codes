import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BreadthFirstSearch {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int noOfVertex, int startVertex) {

        ArrayList<Integer> bfs = new ArrayList<Integer>();
        boolean visited[] = new boolean[noOfVertex + 1];

        Queue<Integer> q = new LinkedList<Integer>();

        visited[startVertex] = true;
        q.add(startVertex);

        while (!(q.isEmpty())) {
            int vertex = q.poll();
            bfs.add(vertex);

            for (Integer i : graph.get(vertex)) {
                if (visited[i] == false) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }

        System.out.println(bfs);

    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= 9; i++)
            graph.add(new ArrayList<Integer>());

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(6);
        graph.get(6).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(4).add(5);
        graph.get(5).add(4);

        graph.get(5).add(8);
        graph.get(8).add(5);

        graph.get(8).add(7);
        graph.get(7).add(8);

        graph.get(7).add(6);
        graph.get(6).add(7);

        graph.get(9).add(6);
        graph.get(6).add(9);

        // System.out.println(graph);

        bfs(graph, 9, 1);

    }
}