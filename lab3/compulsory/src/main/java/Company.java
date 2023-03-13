public class Company implements Node, Comparable<Company> {
    private String name;

    Company(){};
    Company(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public static int compareTo(Company o) {

    }
}
