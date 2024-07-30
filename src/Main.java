public class Main {
    public static void main(String[] args) {
        // Don't change this code
        Graph graph = new Graph(3);
        graph.addVertex(new Vertex('A'));
        graph.addVertex(new Vertex('B'));
        graph.addVertex(new Vertex('C'));

        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(2, 0); // C -> A

        graph.display();
    }
}


    }
}
