import java.util.*;

public class BreadthFirstSearch<V> extends Search<V> {
    private Map<V, Boolean> marked;

    public BreadthFirstSearch(WeightedGraph<V> graph, V start) {
        super(start);
        marked = new HashMap<>();
        bfs(graph, start);
    }

    private void bfs(WeightedGraph<V> graph, V start) {
        Queue<V> queue = new LinkedList<>();
        queue.add(start);
        marked.put(start, true);

        while (!queue.isEmpty()) {
            V v = queue.remove();
            for (Vertex<V> w : graph.getVertex(v).getAdjacentVertices().keySet()) {
                if (!marked.containsKey(w.getData())) {
                    queue.add(w.getData());
                    marked.put(w.getData(), true);
                    edgeTo.put(w.getData(), v);
                }
            }
        }
    }
}
