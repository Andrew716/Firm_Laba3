import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Employee extends Person {
    private Department department;
    private String position;
    private Set<Project> projects = new HashSet<Project>();

    public Employee(Date birthdayDate, int id, String name, String surname ) {
        super(birthdayDate, id, name, surname);

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString(){
        return "Employee : " + "  name= "+  name + "  surname= " + surname  + "  id= " + id + "  birthday= " + birthdayDate + "  department= " + department + "  position= " + position + "  isworking = " + getProjects();
    }

}
