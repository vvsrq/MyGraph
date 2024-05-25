import java.util.*;

public class MyGraph<Vertex> {
    private Map<Vertex, Map<Vertex, Integer>> list;

    public MyGraph(){
        list = new HashMap<>();
    }

    public void addVertex(Vertex vertex) {
        list.put(vertex, new HashMap<>());
    }

    public void addEdge(Vertex source, Vertex destination, int weight) {
        checkVertex(source);
        checkVertex(destination);
        list.get(source).put(destination,weight);
        list.get(destination).put(source,weight); //The method now takes an additional weight parameter.
    }

    private void checkVertex(Vertex vertex) {
        if (!list.containsKey(vertex))
            throw new IndexOutOfBoundsException("Vertex does not exist");
    }

    public boolean hasEdge(Vertex source, Vertex destination) {
        checkVertex(source);
        checkVertex(destination);
        return list.get(source).containsKey(destination);
    }

    public Map<Vertex, Integer> getNeighbors(Vertex vertex) {
        checkVertex(vertex);
        return list.get(vertex);
    }

    public void printGraph() {
        for (Vertex vertex : list.keySet()) {
            System.out.println("Vertex " + vertex + " connected to: ");
            for (Map.Entry<Vertex, Integer> neighbor : list.get(vertex).entrySet()) {
                System.out.println(neighbor.getKey() + " (weight: " + neighbor.getValue() + ")");
            }
        }
    }

    public void removeEdge(Vertex source, Vertex destination) {
        checkVertex(source);
        checkVertex(destination);
        list.get(source).remove(destination);
        list.get(destination).remove(source);
    }

}