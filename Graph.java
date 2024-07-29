class Graph {
    public int vertex;
    int[][] adj;
    
    public Graph(int n) {
        this.vertex = n;
        adj = new int[vertex][vertex];
    }
    
    public void display() {
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[0].length; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public void addEdge(int i, int j) {
        adj[i][j] = 1;
        adj[j][i] = 1;
    }
    
    public void addEdge(int i, int j,int weight) {
        adj[i][j] = weight;
        adj[j][i] = weight;
    }
    
    public void direct(int i,int j)
    {
        adj[i][j]=1;
    }
    
    public void removeEdge(int i, int j) {
        adj[i][j] = 0;
        adj[j][i] = 0;
    }
    
    public void addVertex() {
        int[][] newAdj = new int[vertex + 1][vertex + 1];
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[0].length; j++) {
                newAdj[i][j] = adj[i][j];
            }
        }
        adj = newAdj;
        vertex++;
    }
    
    public void removeVertex(int v) {
        if (v < 0 || v >= vertex) {
            System.out.println("Invalid vertex number");
            return;
        }
        
        int[][] newAdj = new int[vertex - 1][vertex - 1];
        for (int i = 0, ni = 0; i < vertex; i++) {
            if (i == v) continue;
            for (int j = 0, nj = 0; j < vertex; j++) {
                if (j == v) continue;
                newAdj[ni][nj++] = adj[i][j];
            }
            ni++;
        }
        adj = newAdj;
        vertex--;
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Graph gr = new Graph(4);
        gr.addEdge(1, 2);
        gr.addEdge(2, 3);
        gr.removeEdge(1, 2);
        gr.addVertex();
        gr.addVertex();   
        gr.display();
        System.out.println();
        gr.addEdge(2, 5,6);
        gr.direct(0,0);
        gr.direct(1,0);
        gr.removeVertex(4);
        gr.removeVertex(3);
        gr.removeVertex(2);
        gr.display();
    }
}
