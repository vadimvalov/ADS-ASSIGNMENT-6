import java.util.*;

public class BreadthFirstSearch {
    private Search<Vertex> search;

    public BreadthFirstSearch(MyGraph<Vertex> graph, Vertex source) {
        search = new Search<>(source);
        bfs(graph, source);
    }

    private void bfs(MyGraph<Vertex> graph, Vertex source) {
        search.mark(source);
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();

            for (Vertex vertex : graph.adjacencyList(current)) {
                if (!search.isMarked(vertex)) {
                    search.mark(vertex);
                    search.addEdge(vertex, current);
                    queue.add(vertex);
                }
            }
        }
    }
}
