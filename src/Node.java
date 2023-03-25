import java.util.Comparator;
import java.util.TreeMap;

public class Node {
    private String label;
    private int weight = Integer.MAX_VALUE;
    private TreeMap<Node, Integer> links;
    private Node prev = null;

    public Node(String label){
        this.label = label;
        links = new TreeMap<>((a, b) -> a.label.compareTo(b.label));
    }
    public void link(Node node2, Integer weight){
        links.put(node2, weight);
        node2.links.put(this, weight);
    }
    public int weightTo(Node node){
        return weight + links.get(node);
    }
    public String getPath(){
        String weight = "";
        if (this.weight < MAX_VALUE)
            weight += this.weight;
        else
            weight = "inf";
        String out = "(" + label + "-" + weight + ")";
        if (prev != null){
            out = prev.getPath() + "-" + prev.links.get(this) + "->" + out;
        }
        return out;
    }
    Comparator<Node> comparator = (o1, o2) -> o1.weight - o2.weight;
}
