import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.IntStream;

public class Compulsory {
    public static void main(String[] args){

        Faker faker = new Faker();

        var students = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new Student(faker.name().fullName()))
                .toArray(Student[]::new);
        var projects = IntStream.rangeClosed(0,2)
                .mapToObj(i -> new Project(faker.company().name()) )
                .toArray(Project[]::new);

        List<Student> listOfStudents = new LinkedList<>();
        for( Student s : students){
            listOfStudents.add(s);
        }

        Collections.sort(listOfStudents, Student::compareTo);

        TreeSet listOfProjects = new TreeSet();

        for(Project p : projects){
            listOfProjects.add(p);
        }

        Problem pb = new Problem(listOfProjects,listOfStudents);
        pb.projectPreferences(listOfStudents.get(0), Arrays.asList(projects[0], projects[1], projects[2]));
        pb.projectPreferences(listOfStudents.get(1), Arrays.asList(projects[0], projects[1], projects[2]));
        pb.projectPreferences(listOfStudents.get(2), Arrays.asList(projects[0], projects[1], projects[2]));

        pb.problemSolution();
    }
}
