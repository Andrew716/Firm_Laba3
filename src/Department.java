import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Department {
    private String nameOfDepartment;
    private Set<Employee> employees = new HashSet<Employee>();
    //private Map<String,Employee> employees = new HashMap<String,Employee>();

    public Department(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee newEmployee){
        employees.add(newEmployee);
    }

}
