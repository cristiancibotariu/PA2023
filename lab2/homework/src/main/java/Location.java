import java.util.Objects;

public abstract class Location {
    protected String name;
    protected int X;
    protected int Y;
    protected Road route1;
    protected Road route2;


    public Location() { }
    public Location(String name, int X, int Y, Road route1, Road route2) {
        this.name = name;
        this.X = X;
        this.Y = Y;
        this.route1 = route1;
        this.route2 = route2;
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

    public void setRoute1(Road route1){
        this.route1 = route1;
    }

    public void setRoute2(Road route2){
        this.route2 = route2;
    }

    public Road getRoute1(){
        return this.route1;
    }

    public Road getRoute2(){
        return this.route2;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                ", route1=" + route1 +
                ", route2=" + route2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return X == location.X && Y == location.Y && Objects.equals(name, location.name) && Objects.equals(route1, location.route1) && Objects.equals(route2, location.route2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, X, Y, route1, route2);
    }
}
