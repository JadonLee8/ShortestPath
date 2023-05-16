
public class Graph {
    private Set<Node> cities;

    public Graph(){
        cities = new HashSet<Node>();
        getData();
    }


    public void getData(){
        Scanner distReader = new Scanner(new File("usca312_dist.txt"));
        Scanner nameReader = new Scanner(new File("usca312_name.txt"));
        distReader.close();
        nameReader.close();
    }
}
