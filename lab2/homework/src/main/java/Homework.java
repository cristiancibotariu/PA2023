public class Homework {
    public static void main(String[] args){

        Road[] roads = new Road[4];
        Location[] locs = new Location[6];

        roads[0] = new Road();
        roads[0].setName("A Highway");
        roads[0].setLength(450);
        roads[0].setSpeedLimit(130);
        roads[0].setType(Road.RoadType.HIGHWAY);

        roads[1] = new Road("B Highway", Road.RoadType.HIGHWAY,130,200);
        roads[2] = new Road("C Highway", Road.RoadType.HIGHWAY,130,50);
        roads[3] = new Road("D Express", Road.RoadType.EXPRESS,100,40);

        locs[0] = new Airport();
        locs[0].setName("Henri Coanda Airport");
        locs[0].setY(20);
        locs[0].setX(21);
        locs[0].setRoute1(roads[0]);
        locs[0].setRoute2(roads[1]);

        locs[1] = new Airport("Iasi Airport",20,25, roads[1], roads[2]);
        locs[2] = new GasStation("A Gas Station",20,25, roads[2], roads[3]);
        locs[3] = new GasStation("B Gas Station", 35,20,null,null);
        locs[4] = new City("Vaslui",20,10,roads[0],null);
        locs[5] = new City("Iasi",10,20,null,roads[0]);

        Problem problem = new Problem(locs, roads);
        problem.setLocations(locs);
        problem.setRoads(roads);
        Boolean[] visited = new Boolean[locs.length];
        for(int i=1;i<locs.length;i++)
            visited[i]=false;
        visited[0] = true;
        if(problem.validity(locs, roads) == true)
            System.out.println(problem.algorithm(locs[0],locs[3],visited));

    }

    public static void printLocObj(Location[] locs){
        for(int i=0;i<locs.length;i++)
            System.out.println("This is an object of the location class" + locs[i]);
    }

    public static void printRoadObj(Road[] roads){
        for(int i=0;i<roads.length;i++) {
            System.out.println("This is an object of the road class: " + roads[i]);
        }
    }
}
