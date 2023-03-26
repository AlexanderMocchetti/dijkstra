import java.util.TreeSet;

public class Graph {
    private TreeSet<Node> vertices;

    public void addVertice(Node node){
        vertices.add(node);
    }

    public TreeSet<Node> getVertices() {
        return vertices;
    }

    public Graph(TreeSet<Node> vertices) {
        this.vertices = vertices;
    }
}