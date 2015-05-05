import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Manager extends Person {
    private Set<Project> projects = new HashSet<Project>();


    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public Manager(Date birthdayDate, int id, String name, String surname) {
        super(birthdayDate, id, name, surname);
    }

    @Override
    public String toString(){
        return " Manager : "+ birthdayDate + id + name + surname;
    }
}
