import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private int[][] adjMatrix;

    public Graph(int size) {
        vertices = new ArrayList<>(size);
        adjMatrix = new int[size][size];
    }

    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    public void addEdge(int src, int dst) {
        adjMatrix[src][dst] = 1;
    }

    public void display() {
        // Print the vertices in one line
        System.out.print("  ");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + "  ");
        }
        System.out.println();

        // Columns
        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i).data + " ");

            // Rows
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(adjMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
