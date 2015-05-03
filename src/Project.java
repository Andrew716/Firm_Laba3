import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Project {
    private String nameOfProject;
    private Manager manager;
    private Set<Employee> employeesOnProject = new HashSet<Employee>();

    public Project(Manager manager, String nameOfProject) {
        this.manager = manager;
        this.nameOfProject = nameOfProject;
    }

    public Set<Employee> getEmployeesOnProject() {
        return employeesOnProject;
    }

    public void setEmployeesOnProject(Set<Employee> employeesOnProject) {
        this.employeesOnProject = employeesOnProject;
    }

    public void addEmployee(Employee newEmployee){
        employeesOnProject.add(newEmployee);
    }

    @Override
    public String toString(){
        return "Project :  " + nameOfProject + " " + manager;
    }
}
