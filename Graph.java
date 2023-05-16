import java.util.Scanner;

public class Graph {
    private Set<Node> cities;

    public Graph(){
        cities = new HashSet<Node>();
        getData();
    }


    public void getData(){
        Scanner distReader = new Scanner(new File("usca312_dist.txt"));
        Scanner nameReader = new Scanner(new File("usca312_name.txt"));
        while(nameReader.nextLine().contains("#"));
        while(distReader.nextLine().contains("#"));
        int[][] adjMatrix = new int[312][312];
        for (int r = 0; r < 312; r++){
            for (int c = 0; c < 312; c++){
                adjMatrix[r][c] = distReader.nextInt("9");
                System.out.println(adjMatrix[r][c]);
            }
        }
        for (int r = 0; r < 312; r++){
            Node newCity = new Node(nameReader.nextLine());
            cities.add(newCity);
        }

        distReader.close();
        nameReader.close();
    }
}
