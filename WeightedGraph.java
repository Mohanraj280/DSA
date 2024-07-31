
import java.util.*;
class Graph
{
    private int source;
    private int destination;
    private int weight;
    public Graph()
    {
        
    }
    public Graph(int source,int destination,int weight)
    {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    
    public int getDestination()
    {
        return destination;
    }
}

class WeightedGraph
{
    int vertex;
    List<Graph>[] gra;
    public WeightedGraph(int vertex)
    {
        this.vertex = vertex;
        gra = new ArrayList[vertex];
        for(int i=0;i<vertex;i++)
        gra[i] = new ArrayList<>();
    }
    
    public List<Graph>[] getVertices() {
    return gra;
    }
    
    public void addDirectedGraph(int i, int j, int weight)
    {
        Graph edge=new Graph(i,j,weight);
        gra[i].add(edge);
    }
    
     public void addUnDirectedGraph(int i, int j, int weight)
    {
        Graph edge=new Graph(i,j,weight);
        Graph edge1=new Graph(j,i,weight);
        gra[i].add(edge);
        gra[j].add(edge1);
    }
    
    public void removeDirectedEdge(int source, int destination)
    {
        for(Graph edge : gra[source])
        if(edge.getDestination() == destination)
        {
             gra[source].remove(edge);
                break;
        }
    }
    
    public void removeUndirectedEdge(int source, int d)
    {
        removeDirectedEdge(source,d);
        removeDirectedEdge(d,source);
    }
    
    public void removeVertex(int source)
    {
        List<Graph>[] vertices = getVertices();
        // System.out.println(vertices);
        for (int i = 0; i < vertices.length; i++) {
            if(i==source)
            continue;
            System.out.print("Vertex " + i + " is connected to: ");
            for (Graph edge : vertices[i])
            if(edge.getDestination()==source)
            continue;
            else
            System.out.print(edge.getDestination() + " ");
          System.out.println();
        }
    }
    
}

public class Main
{
    public static void main(String[] args)
    {
        WeightedGraph weight=new WeightedGraph(5);
        weight.addUnDirectedGraph(1,2,4);
        weight.addUnDirectedGraph(2,3,5);
        //weight.removeDirectedEdge(1,2);
        weight.removeVertex(1);
        List<Graph>[] vertices = weight.getVertices();
        System.out.println();
        for (int i = 0; i < vertices.length; i++) {
          System.out.print("Vertex " + i + " is connected to: ");
          for (Graph edge : vertices[i])
            System.out.print(edge.getDestination() + " ");
          System.out.println();
        }
    }
}
