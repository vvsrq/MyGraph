import java.util.*;

public class bFS {
    public static <Vertex> void search(MyGraph<Vertex> graph, Vertex startVertex) {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();

        visited.add(startVertex);
        queue.offer(startVertex);

        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            System.out.print(vertex + " ");

            Map<Vertex, Integer> neighbors = graph.getNeighbors(vertex);
            for (Vertex neighbor : neighbors.keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
}
