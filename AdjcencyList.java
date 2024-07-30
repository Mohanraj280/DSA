
import java.util.*;
class Graph
{
    Map<Integer, List<Integer>> map;
    public Graph()
    {
         map=new HashMap<>();
    }
    public void addVertex(int vertex)
    {
       map.put(vertex,new LinkedList<>());
    }
    public void addEdge(int source, int destination)
    {
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    
     public void removeEdge(int source, int destination)
    {
        map.get(source).remove((Integer) destination);
        map.get(destination).remove((Integer) source);
    }
    
    public void removeVertex(int vertex)
    {
        map.remove(vertex);
        for(List<Integer> nei : map.values())
        {
            nei.remove((Integer) vertex);
        }
    
    }
}
public class HelloWorld {
    public static void main(String[] args) {
        Graph a=new Graph();
        a.addVertex(1);
        a.addVertex(2);
        a.addVertex(3);
        a.addVertex(4);
       
        a.addEdge(1,2);
        a.addEdge(2,3);
        a.addEdge(3,4);
        a.removeEdge(3,4);
        a.removeVertex(3);
       
        System.out.println(a.map);
    }
}
