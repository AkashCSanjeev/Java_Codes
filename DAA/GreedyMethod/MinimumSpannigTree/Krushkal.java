import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GraphNode {
    int source, destination, weight;

    public GraphNode(int source, int destination, int weight) {
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

public class Krushkal {

    /**
     * 
     * For krushkal we use disjoint set
     * We write two function for disjoint set
     * -> getParent() gets the parent of the node
     * -> union() joins two set
     * 
     */
    static int getParent(int parent[], int vertex) {

        if (vertex == parent[vertex]) {
            return vertex;
        }

        return parent[vertex] = getParent(parent, parent[vertex]);

    }

    static void union(int parent[], int rank[], int vertex1, int vertex2) {
        vertex1 = getParent(parent, vertex1);
        vertex2 = getParent(parent, vertex2);

        if (rank[vertex1] > rank[vertex2]) {
            parent[vertex2] = vertex1;
        } else if (rank[vertex1] < rank[vertex2]) {
            parent[vertex1] = vertex2;
        } else {
            parent[vertex2] = vertex1;
            rank[vertex1]++;
        }

    }

    static void krushkal(ArrayList<GraphNode> graph, int noOfVertex) {
        Comparator<GraphNode> c = new Comparator<GraphNode>() {

            @Override
            public int compare(GraphNode o1, GraphNode o2) {
                if (o1.getWeight() > o2.getWeight())
                    return 1;
                return -1;
            }

        };

        Collections.sort(graph, c);

        int parent[] = new int[noOfVertex];
        int rank[] = new int[noOfVertex];

        for (int i = 0; i < noOfVertex; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int minCost = 0;
        ArrayList<GraphNode> mst = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {
            if (getParent(parent, graph.get(i).getSource()) != getParent(parent, graph.get(i).getDestination())) {
                minCost = minCost + graph.get(i).getWeight();
                mst.add(graph.get(i));
                union(parent, rank, graph.get(i).getSource(), graph.get(i).getDestination());
            }
        }

        System.out.println("Minimum Cost : " + minCost);
        for (int i = 0; i < mst.size(); i++) {
            System.out.println(mst.get(i).getSource() + " - " + mst.get(i).getDestination());
        }

    }

    public static void main(String[] args) {
        ArrayList<GraphNode> graph = new ArrayList<>();
        graph.add(new GraphNode(0, 1, 10));
        graph.add(new GraphNode(0, 2, 6));
        graph.add(new GraphNode(0, 3, 5));
        graph.add(new GraphNode(1, 3, 15));
        graph.add(new GraphNode(2, 3, 4));

        krushkal(graph, 4);
    }
}
