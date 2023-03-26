import java.util.PriorityQueue;
import java.util.TreeMap;

public class Graph {
    private TreeMap<String, Node> vertices;
    public Graph() {
        vertices = new TreeMap<>((a, b) -> a.compareTo(b));
    }
    public void addVertice(Node node){
        vertices.put(node.getLabel(), node);
    }
    public void addVertice(String label){
        vertices.put(label, new Node(label));
    }
    public void removeVertice(Node node){
        vertices.remove(node.getLabel());
    }
    public void removeVertice(String label){
        vertices.remove(label);
    }

    public TreeMap<String, Node> getVertices() {
        return vertices;
    }

    public void setVertices(TreeMap<String, Node> vertices) {
        this.vertices = vertices;
    }

    public void dijkstraShortestPath(String source, String destination) {
        Node node = null;
        Node destinationNode;
        destinationNode = vertices.get(destination);
        PriorityQueue<Node> unvisitedNodes = new PriorityQueue<>((a, b) -> a.getWeight() - b.getWeight());
        vertices.values().forEach(n -> n.setWeight(Integer.MAX_VALUE));
        vertices.get(source).setWeight(0);
        unvisitedNodes.addAll(vertices.values());
        while(!unvisitedNodes.isEmpty() && destinationNode != node){
            node = unvisitedNodes.remove();
            for(Node neighbourNode: node.getLinks().keySet()){
                if(neighbourNode.getWeight() > node.weightTo(neighbourNode)) {
                    neighbourNode.setWeight(node.weightTo(neighbourNode));
                    neighbourNode.setPrev(node);
                }
            }
        }
    }
}