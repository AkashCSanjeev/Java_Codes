import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node implements Comparator<Node> {
    int vertex, weight;

    public Node(int adjVertex, int weight) {
        this.vertex = adjVertex;
        this.weight = weight;
    }

    public int getVertex() {
        return vertex;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compare(Node o1, Node o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        }
        return 0;
    }

    public Node() {
    }

}

class Dijkstra {

    static void dijkstra(int startVertex, ArrayList<ArrayList<Node>> graph, int N) {
        int distance[] = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[startVertex] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(N, new Node());
        pq.add(new Node(startVertex, 0));

        while (pq.size() > 0) {
            Node node = pq.poll();

            for (Node it : graph.get(node.getVertex())) {
                if (distance[node.getVertex()] + it.getWeight() < distance[it.getVertex()]) {
                    distance[it.getVertex()] = distance[node.getVertex()] + it.getWeight();
                    pq.add(new Node(it.getVertex(), distance[it.getVertex()]));
                }
            }
        }
        System.out.println("The distances from source " + startVertex + " are : ");
        for (int i = 0; i < N; i++) {
            System.out.println(startVertex + " - " + i + "  " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<Node>());

        graph.get(0).add(new Node(1, 2));
        graph.get(1).add(new Node(0, 2));

        graph.get(1).add(new Node(2, 4));
        graph.get(2).add(new Node(1, 4));

        graph.get(0).add(new Node(3, 1));
        graph.get(3).add(new Node(0, 1));

        graph.get(3).add(new Node(2, 3));
        graph.get(2).add(new Node(3, 3));

        graph.get(1).add(new Node(4, 5));
        graph.get(4).add(new Node(1, 5));

        graph.get(2).add(new Node(4, 1));
        graph.get(4).add(new Node(2, 1));

        dijkstra(0, graph, n);

    }
}