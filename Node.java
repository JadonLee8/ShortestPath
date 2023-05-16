import java.util.LinkedList;
import java.util.List;

public class Node{
    private String cityName;
    private List<Edge> edgeList;

    public Node(String name){
        cityName = name;
        edgeList = new LinkedList<Edge>();
    }

    public void addEdge(Node to, int w){
        edgeList.add(new Edge(this, to, w));
    }

    public List<Edge> getEdges(){
        return edgeList;
    }

    @Override
    public int hashCode(){
        return cityName.hashCode();
    }
}