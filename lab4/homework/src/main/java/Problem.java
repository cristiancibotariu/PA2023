import com.sun.source.tree.Tree;

import java.util.*;

public class Problem {

    private TreeSet projects = new TreeSet();
    private List<Student> students = new LinkedList<>();
    Map<Student, List<Project>> prefMap = new HashMap<>();

    Problem(){}

    public Problem(TreeSet projects, List<Student> students) {
        this.projects = projects;
        this.students = students;
    }

    public TreeSet getProjects() {
        return projects;
    }

    public void setProjects(TreeSet projects) {
        this.projects = projects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList students) {
        this.students = students;
    }

    public void projectPreferences(Student student, List<Project> projects){
        prefMap.put(student, projects);
    }

    public void prefsAvg(List<Student> students){
        int avg = 0;
        for(Student s : students){
            avg = avg + (prefMap.get(s)).size();
        }
        avg = avg / prefMap.size();

        for(Student s : students){
            if((prefMap.get(s)).size()<=avg){
                System.out.println(s.getName());
            }
        }
    }

    public void simpleMapPrint(){
        System.out.println(prefMap);
    }

    public void problemSolution(){
        //List<Project> visited = new ArrayList<Project>();
        Project[] visited = new Project[projects.size()];
        int index = 0;
        boolean ok=true;
        for(Student s : students){
            for(Project p : (prefMap.get(s))){
                if((prefMap.get(s)).size()==0) {
                    ok=false;
                    break;
                }
                ok = true;
                for(Project j : visited){
                    if(visited.length==0){
                        break;
                    }
                    if(j!=null && j.equals(p) == true){
                        ok=false;
                    }
                }
                if(ok==true) {
                    System.out.println("Studentul " + s.getName() + " are asignat proiectul " + p.getName());
                    visited[index] = p;
                    index++;
                    break;
                }
            }
            if(ok==false) System.out.println("Studentul " + s.getName() + " nu are proiect asignat");
        }

    }
}
