import java.util.Objects;

public class Road {
    private String name;
    public enum RoadType{
        HIGHWAY, EXPRESS;
    }
    private RoadType type;
    private int speedLimit;
    private int length;

    public Road() { }
    public Road(String name, RoadType type, int speedLimit, int length) {
        this.name = name;
        this.type = type;
        this.speedLimit = speedLimit;
        this.length = length;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setSpeedLimit(int speedLimit){
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit(){
        return this.speedLimit;
    }

    public void setLength(int length){
        this.length=length;
    }

    public int getLength(){
        return this.length;
    }

    public void setType(RoadType type){
        this.type = type;
    }

    public RoadType getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return "Road{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", speedLimit=" + speedLimit +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Road road = (Road) o;
        return speedLimit == road.speedLimit && length == road.length && Objects.equals(name, road.name) && type == road.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, speedLimit, length);
    }
}
