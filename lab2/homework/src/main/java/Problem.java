public class Problem {
    private Location[] locations;
    private Road[] roads;

    public Problem(Location[] locations, Road[] roads) {
        this.locations = locations;
        this.roads = roads;
    }

    public Problem() {}

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public Road[] getRoads() {
        return roads;
    }

    public void setRoads(Road[] roads) {
        this.roads = roads;
    }

    public Boolean algorithm(Location loc1, Location loc2, Boolean[] visited) {
        if(loc2.route1 == null && loc2.route2 == null)
            return false;
        if(loc1.route1 == null && loc2.route2 == null)
            return false;
        if((loc1.route1 == loc2.route1) || (loc1.route1 == loc2.route2))
            return true;
        if((loc1.route2 == loc2.route1) || (loc1.route2 == loc2.route2))
            return true;
        for(int i = 0; i<locations.length;i++){
            if(locations[i]!=loc1 && visited[i] == false) {
                visited[i] = true;
                if ((loc1.route1 == locations[i].route1) || (loc1.route1 == locations[i].route2)) {
                    return algorithm(locations[i], loc2, visited);
                }
                if ((loc1.route2 == locations[i].route1) || (loc1.route2 == locations[i].route2)) {
                    return algorithm(locations[i], loc2, visited);
                }
            }
        }
        return false;
    }

    public Boolean validity(Location[] locations, Road[] roads){
        if(locations.length < 2)
            return false;
        for(int i=0;i<locations.length-1;i++){
            for(int j=i+1;j< locations.length;j++) {
                if (locations[i].equals(locations[j]) == true) {
                    return false;
                }
            }
        }
        for(int i=0;i<roads.length-1;i++){
            for(int j=i+1;j<roads.length;j++){
                if(roads[i].equals(roads[j]) == true){
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean validity(Location loc1, Location loc2){
        if((loc1.route1 == null && loc1.route2 == null) || (loc2.route1 == null && loc2.route2 == null))
            return false;
        return true;
    }
}
