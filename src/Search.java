import java.util.*;

public class Search<V> {
    protected Set<V> marked;
    protected Map<V, V> edgeTo;
    protected final V source;

    public Search(V source) {
        this.source = source;
        marked = new HashSet<>();
        edgeTo = new HashMap<>();
    }

    public void mark(V vertex) {
        marked.add(vertex);
    }

    public boolean isMarked(V vertex) {
        return marked.contains(vertex);
    }

    public void addEdge(V vertex, V parent) {
        edgeTo.put(vertex, parent);
    }

    public Iterable<V> pathTo(V vertex) {
        if (!hasPathTo(vertex)) return null;
        LinkedList<V> path = new LinkedList<>();
        for (V v = vertex; v != source; v = edgeTo.get(v)) {
            path.push(v);
        }
        path.push(source);
        return path;
    }

    public boolean hasPathTo(V vertex) {
        return marked.contains(vertex);
    }

    public V getSource() {
        return source;
    }
}
