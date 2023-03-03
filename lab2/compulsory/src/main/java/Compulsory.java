public class Compulsory {
    public static void main(String[] args){

        Location loc1 = new Location();
        Road road1 = new Road();

        loc1.setName("Iasi");
        loc1.setType(Location.LocationType.CITY);
        loc1.setX(25);
        loc1.setY(30);

        road1.setName("X Highway");
        road1.setLength(450);
        road1.setSpeedLimit(130);
        road1.setType(Road.RoadType.HIGHWAY);

        printLocObj(loc1);
        printRoadObj(road1);

        Location loc2 = new Location("Vaslui",45,50, Location.LocationType.CITY);
        Road road2 = new Road("Y Highway", Road.RoadType.HIGHWAY,130,200);

        printLocObj(loc2);
        printRoadObj(road2);
    }

    public static void printLocObj(Location loc){
        System.out.println("This is an object of the location class: " + loc);
    }

    public static void printRoadObj(Road road){
        System.out.println("This is an object of the road class: " + road);
    }
}
