import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class Person implements Node, Comparable<Person> {

    private Map<Node, String> relationships = new HashMap<>();
    private String name;
    private String dob;
    private Company company;
    protected enum EyeColor{
        BROWN, BLUE, GREEN
    }
    private EyeColor color;

    Person(){};

    Person(String name, Company company, String dob, EyeColor color) {
        this.name = name;
        this.company = company;
        this.dob = dob;
        this.color = color;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public EyeColor getColor() {
        return color;
    }

    public void setColor(EyeColor color) {
        this.color = color;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addRelationship(Node node, String value) {
        relationships.put(node, value);
    }

    public int getRelationshipSize(){
        return this.relationships.size();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

}
