public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertice("Casa");
        graph.addVertice("Bar");
        graph.addVertice("Conad");
        graph.addVertice("Stazione");
        graph.addVertice("Comune");
        graph.getVertice("Casa").link(graph.getVertice("Comune"), 1);
        graph.getVertice("Conad").link(graph.getVertice("Casa"), 2);
    }
}
