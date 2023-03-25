import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    HashSet<Node> vertices;
    HashMap<HashSet<Node>, Integer> edges;

    public Graph(HashSet<Node> vertices, HashMap<HashSet<Node>, Integer> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }
    public void addNode(Node newNode, Node neighbourNode, Integer weight){
        vertices.add(newNode);
        HashSet<Node> newKey = new HashSet<>();
        newKey.add(newNode);
        newKey.add(neighbourNode);
        edges.put(newKey, weight);
    }
    public void addNode(Node newNode){
        vertices.add(newNode);
    }
    public void removeNode(Node node){
        vertices.remove(node);
        for(HashSet<Node> key: edges.keySet()){
            if(key.contains(node))
                edges.remove(key);
        }
    }
    public void addEdge(Node node, Node neighbourNode, Integer weight){
        addNode(node, neighbourNode, weight);
    }
    public void removeEdge(Node node, Node neighbourNode) {
        HashSet<Node> key = new HashSet<>();
        key.add(node);
        key.add(neighbourNode);
        edges.remove(key);
    }
}