import java.util.*;

public class Compulsory {
    public static void main(String[] args){

    Company[] companies = new Company[4];
    companies[0] = new Company("Bosch","Germany");
    companies[1] = new Company("Samsung","Southern Koreea");
    companies[2] = new Company("Apple","USA");
    companies[3] = new Company("Huawei","China");

    Arrays.sort(companies, Company :: compareTo);

    Person[] persons = new Person[4];
    persons[0] = new Designer("Ionescu", companies[0],"1995/01/26", Person.EyeColor.BLUE);
    persons[1] = new Programmer("Popescu", companies[1], "1990/12/24", Person.EyeColor.BROWN);
    persons[2] = new Programmer("Marinescu", companies[1], "1992/11/23", Person.EyeColor.BROWN);
    persons[3] = new Designer("Bitanescu", companies[2], "1994/08/16", Person.EyeColor.GREEN);

    List<Node> nodesList = new ArrayList<>();
    addNodes(nodesList,companies,persons);

    persons[0].addRelationship(nodesList.get(3), "Boss");
    persons[0].addRelationship(nodesList.get(4),"bffs");

    Network network = new Network();
    network.setNodes(nodesList);

        System.out.println(network);

    }

    public static void addNodes(List<Node> nodesListTemp, Company[] companies, Person[] persons){

        for(int i=0;i< companies.length;i++) nodesListTemp.add(companies[i]);
        for(int i=0;i< persons.length;i++) nodesListTemp.add(persons[i]);

    } //asta ar putea fi optimizata
}
