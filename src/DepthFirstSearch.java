public class DepthFirstSearch {
    private Search<Vertex> search;

    public DepthFirstSearch(MyGraph<Vertex> graph, Vertex source) {
        search = new Search<>(source);
        dfs(graph, source);
    }

    private void dfs(MyGraph<Vertex> graph, Vertex source) {
        search.mark(source);
        for (Vertex vertex : graph.adjacencyList(source)) {
            if (!search.isMarked(vertex)) {
                search.addEdge(vertex, source);
                dfs(graph, vertex);
            }
        }
    }
}
