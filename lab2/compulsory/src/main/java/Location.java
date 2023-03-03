public class Location {
    private String name;
    private int X;
    private int Y;
    public enum LocationType{
        CITY, AIRPORT, GASSTATION;
    }
    private LocationType type;

    public Location() { }
    public Location(String name, int X, int Y, LocationType type) {
        this.name = name;
        this.X = X;
        this.Y = Y;
        this.type = type;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setX(int X){
        this.X = X;
    }

    public int getX(){
        return this.X;
    }

    public void setY(int Y){
        this.Y = Y;
    }

    public int getY(){
        return this.Y;
    }

    public void setType(LocationType type){
        this.type = type;
    }

    public LocationType getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                ", type=" + type +
                '}';
    }
}
