public class Edge{
    private int w;
    private Node from;
    private Node to;

    public Edge(Node from, Node to, int w){
        this.from = from;
        this.to = to;
        this.w = w;
    }

    public Edge(Node from, Node to){
        this.from = from;
        this.to = to;
        w = 1;
    }

    public Node getOrigin(){return from;}
    public Node getDestination(){return to;}
    public int getWeight(){return w;}

    public void setWeight(int newWeight){
        w = newWeight;
    }
}