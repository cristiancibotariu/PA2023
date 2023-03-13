public class Person implements Node, Comparable<Person> {

    private String name;
    public enum PersonSpec{
        PROGRAMMER, DESIGNER;
    }
    private PersonSpec type;
    private Company companyName;

    Person(){};

    Person(String name, PersonSpec type, Company companyName) {
        this.name = name;
        this.type = type;
        this.companyName = companyName;
    }

    public Company getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Company companyName) {
        this.companyName = companyName;
    }

    public PersonSpec getType() {
        return type;
    }

    public void setType(PersonSpec type) {
        this.type = type;
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
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

}
