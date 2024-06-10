import java.util.ArrayList;

class Graph{
    Vertex v;
    static ArrayList<Vertex>verticList = new ArrayList<>();
    public int size; 
    public static int graph[][];
    public Graph(int size){
        this.size = size;
        graph = new int[size][size];
    }

    public static void addEdge(int source, int dest){
        graph[source][dest] =1;
    }

    
    public static void addVertex(Vertex v){
        verticList.add(v);
    }

    public void display(){
        // Matrix
        for(int a = 0; a < size; a++){
            System.out.print("  "+verticList.get(a).data);
        }
        System.out.println();
        for(int x = 0; x < this.size; x++){
            System.out.print(verticList.get(x).data);

            for(int y = 0; y < this.size; y++){
                System.out.print(" " + graph[x][y]);
            }
            System.out.println();

        }
    }}
