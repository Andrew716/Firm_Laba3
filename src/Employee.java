import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Employee extends Person {
    private Department department;
    private String position;
    private String  workingOnProject;
    private Set<Project> projects = new HashSet<Project>();

    public Employee(Date birthdayDate, IdCard id, String name, String surname, Department department, String position,String workingOnProject ) {
        super(birthdayDate, id, name, surname);
        this.department = department;
        this.position = position;
        this.workingOnProject = workingOnProject;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public Department getDepartment(){
        return this.department;
    }

    @Override
    public String toString(){
        return "Employee : " +  name + " " + surname  + " " + id + " " + birthdayDate + " " + department + " " + position + workingOnProject;
    }

}
