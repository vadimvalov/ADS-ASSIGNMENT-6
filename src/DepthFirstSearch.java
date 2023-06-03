public class DepthFirstSearch<V> extends Search<V> {
    
    private Search<Vertex> search;

    public DepthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        dfs(graph, source);
    }

    private void dfs(MyGraph<V> graph, V source) {
        mark(source);
        for (V v : graph.adjacencyList(source)) {
            if (!isMarked(v)) {
                addEdge(v, source);
                dfs(graph, v);
            }
        }
    }
}
