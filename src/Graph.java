import java.util.ArrayList;

public class Graph {
    // Your code here
    // Store the vertices in an ArrayList

    // Store the adjacency matrix which stores the edges

    public Graph(int size) {
        // Your code here
        
    }

    public void addVertex(Vertex vertex) {
        // Your code here
    }

    public void addEdge(int src, int dst) {
        // Your code here
    }

    public void display() {
        
        // print the vertices in one line
        for(int i = 0; i < vertices.size(); i++) {
            System.out.print("  "+vertices.get(i).data);
        }
        System.out.println();

        // columns
        for(int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + " ");

            // rows
            for(int j = 0; j < vertices.size(); j++) {
                System.out.print(adjMatrix[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
