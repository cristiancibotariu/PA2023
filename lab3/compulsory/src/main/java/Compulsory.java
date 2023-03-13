import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Compulsory {
    public static void main(String[] args){


    Company[] companies = new Company[4];
    companies[1] = new Company("Samsung");
    companies[2] = new Company("Apple");
    companies[3] = new Company("Huawei");

        Arrays.sort(companies,(a, b) -> Company.compareTo(a,b));


    Person[] persons = new Person[4];
    persons[1] = new Person("Popescu", Person.PersonSpec.PROGRAMMER,companies[1]);

    List<Node> nodesList = new ArrayList<>();
    nodesList.add(companies[1]);
    for(int i=0;i<nodesList.size();i++){
        System.out.println(companies[i]);
    }
    }
}
