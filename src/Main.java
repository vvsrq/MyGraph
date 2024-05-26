import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>();

        //Adding vertices
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("Z");

        //Adding edges
        graph.addEdge("A", "B", 5);
        graph.addEdge("A", "C", 2);
        graph.addEdge("B", "C", 1);
        graph.addEdge("C", "D", 3);

        //Printing the graph
        System.out.println("Graph structure:");
        graph.printGraph();
        System.out.println("+++++++++++++++++++++++++++++++");

        //Remove edges
        graph.removeEdge("A","B");
        graph.removeEdge("C","A");
        System.out.println("Graph structure:");
        graph.printGraph();
        System.out.println("+++++++++++++++++++++++++++++++");

        //Getting neighbors
        Map<String, Integer> neighbors = graph.getNeighbors("C");
        System.out.println(neighbors);
        //Hassing edges :)
        System.out.println(graph.hasEdge("A","B"));

        //BFS
        System.out.println("+++++++++++++++++++++++++++++++");
        graph.addEdge("A", "B", 5);
        graph.removeEdge("C","D");
        graph.addEdge("C", "Z", 0);
        bFS.search(graph, "A");
    }
}