import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int source, destination, weight;

    public Node(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() {
        return source;
    }

    public int getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }
}

class BellmanFord {

    static void bellmanFord(ArrayList<Node> graph, int noOfVertex, int startVertex) {
        int distance[] = new int[noOfVertex];
        Arrays.fill(distance, 10000);

        distance[startVertex] = 0;

        for (int i = 0; i < noOfVertex - 1; i++) {
            for (Node n : graph) {
                if ((distance[n.getSource()] + n.getWeight()) < distance[n.getDestination()]) {
                    distance[n.getDestination()] = distance[n.getSource()] + n.getWeight();
                }
            }
        }

        for (Node n : graph) {
            if ((distance[n.getSource()] + n.getWeight()) < distance[n.getDestination()]) {
                System.out.println("This is a negative weighted graph");
                return;
            }
        }

        System.out.println(Arrays.toString(distance));

    }

    public static void main(String[] args) {
        int noOfVertex = 6;
        ArrayList<Node> graph = new ArrayList<Node>();

        // Regular graph
        // graph.add(new Node(3, 2, 6));
        // graph.add(new Node(5, 3, 1));
        // graph.add(new Node(0, 1, 5));
        // graph.add(new Node(1, 5, -3));
        // graph.add(new Node(1, 2, -2));
        // graph.add(new Node(3, 4, -2));
        // graph.add(new Node(2, 4, 3));

        // bellmanFord(graph, noOfVertex, 0);

        // Negative weighted graph

        graph.add(new Node(0, 1, 5));
        graph.add(new Node(1, 2, -6));
        graph.add(new Node(2, 0, -5));

        bellmanFord(graph, 3, 0);

    }
}