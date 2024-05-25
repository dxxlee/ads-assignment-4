import java.util.*;

public class DepthFirstSearch<V> extends Search<V> {
    private Map<V, Boolean> marked;

    public DepthFirstSearch(MyGraph<V> graph, V start) {
        super(start); // Call the constructor of the Search class
        marked = new HashMap<>();
        dfs(graph, start);
    }

    private void dfs(MyGraph<V> graph, V v) {
        marked.put(v, true);
        for (V w : graph.getAdjacentVertices(v)) {
            if (!marked.containsKey(w)) {
                edgeTo.put(w, v);
                dfs(graph, w);
            }
        }
    }
}
