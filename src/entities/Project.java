package entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Project {
    private String nameOfProject;
    private Manager manager;
    private Set<Employee> employeesOnProject = new HashSet<Employee>();

    public Project(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public Set<Employee> getEmployeesOnProject() {
        return employeesOnProject;
    }

    public void setEmployeesOnProject(Set<Employee> employeesOnProject) {
        this.employeesOnProject = employeesOnProject;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public void addEmployee(Employee newEmployee){
        employeesOnProject.add(newEmployee);
    }

    @Override
    public String toString(){
        return "entities.Project :  "+"  name of project = " + nameOfProject+ "   " +  manager;
    }
}
