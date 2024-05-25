import java.util.*;

public class MyGraph<V> {
    private Map<V, List<V>> adjacencyList;
    private boolean directed;

    public MyGraph(boolean directed) {
        this.adjacencyList = new HashMap<>();
        this.directed = directed;
    }

    public void addVertex(V v) {
        adjacencyList.putIfAbsent(v, new LinkedList<>());
    }

    public void addEdge(V source, V destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        adjacencyList.get(source).add(destination);
        if (!directed) {
            adjacencyList.get(destination).add(source);
        }
    }

    public List<V> getAdjacentVertices(V v) {
        return adjacencyList.getOrDefault(v, new LinkedList<>());
    }
}
