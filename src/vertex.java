import java.util.Map;

public class vertex<V> {
    private V data;
    private Map<Vertex<V>, double> adjacentVertices;

    public Vertex(){

    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }
    
    public V getData(){

    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
}
