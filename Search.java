import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class Search<V> {
    protected Map<V, V> edgeTo;
    protected V start;

    public Search(V start) {
        this.edgeTo = new HashMap<>();
        this.start = start;
    }

    public boolean hasPathTo(V destination) {
        return edgeTo.containsKey(destination);
    }

    public List<V> pathTo(V destination) {
        if (!hasPathTo(destination)) {
            return null;
        }
        List<V> path = new LinkedList<>();
        for (V x = destination; x != start; x = edgeTo.get(x)) {
            path.add(x);
        }
        path.add(start);
        Collections.reverse(path);
        return path;
    }
}
