import java.util.*;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Customer extends Person {
    private Set<Project> projects = new HashSet<Project>();

    public Customer(Date birthdayDate, IdCard id, String name, String surname) {
        super(birthdayDate, id, name, surname);
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString(){
        return "Customer : " + name + " " + surname + " " + id + " " + birthdayDate;
    }
}