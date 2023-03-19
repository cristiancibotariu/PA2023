public class Company implements Node, Comparable<Company> {
    private String name;
    private String country;

    Company(){};
    Company(String name, String country){
        this.name = name;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public int compareTo(Company o) {
        if(this.getName().compareTo(o.getName())>0){
            return 1;
        }
        else if(this.getName().compareTo(o.getName())==0){
            return 0;
        }
        return -1;
    }
}
