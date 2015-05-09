package entities;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by Andrii on 5/4/2015.
 */
public class Firm {

// method which returns list of employees working on given project
    public static Set<Employee> showEmployeesWorkingOnProject(Project project){
        return project.getEmployeesOnProject();
    }

//method which returns list of projects where given employee still working
    public static Set<Project> showProjectWhereEmployeeWorking(Employee employee){
        return employee.getProjects();
    }

//method which returns list of employees from given department which are not working on any project
    public static List<Employee> showEmployeesInDepartmentNotWorkingOnProject(Department department){
        List<Employee> tempList = new LinkedList<Employee>();
        for (Employee employee : department.getEmployees()){
            if (employee.getProjects().isEmpty()){
                tempList.add(employee);
            }
        }
        return tempList;
    }

//method which returns list of employees which are not working on any project
    public static List<Employee> showEmployeesNotWorking(List<Department> allDepartments){
        List<Employee> tempList = new LinkedList<Employee>();
        for (Department department : allDepartments){
            for(Employee employee : department.getEmployees()){
                if (employee.getProjects().isEmpty()){
                    tempList.add(employee);
                }
            }
        }
        return tempList;
    }

//method which returns list of employees for given manager(for all projects where he manages)
    public static List<Employee> showEmployeesForManager(Manager manager){
        List<Employee> tempList = new LinkedList<Employee>();
        for (Project project : manager.getProjects()){
            for (Employee employee: project.getEmployeesOnProject()){
                tempList.add(employee);
            }
        }
        return tempList;
    }

//method which returns list of manager for given employee(for all projects where employee works)
    public static List<Manager> showManagersForEmployee(Employee employee){
        List<Manager> tempList = new LinkedList<Manager>();
        for (Project project : employee.getProjects()){
            tempList.add(project.getManager());
        }
        return tempList;
    }

//method which returns list of employee which works on the same projects that given employee works
    public static List<Employee> showAnotherEmployeesForEmployee(Employee employee, List<Department> allDepartments){
        List<Employee> tempList = new LinkedList<Employee>();
        for (Department department : allDepartments){
            for (Employee auxiliaryEmployee : department.getEmployees()){
                if (auxiliaryEmployee.getProjects() == employee.getProjects()){
                    tempList.add(auxiliaryEmployee);
                }
            }
        }
        return tempList;
    }

//method which returns list of projects are performed for given customer
    public static Set<Project> showProjectsForCustomer(Customer customer){
        return customer.getProjects();
    }

//method which returns list of employees still working on projects are performed for given customer
    public static List<Employee> showEmployeesWorkingForCustomer(Customer customer){
        List<Employee> tempList = new LinkedList<Employee>();
        for (Project project : customer.getProjects()){
            for (Employee employee : project.getEmployeesOnProject()){
                tempList.add(employee);
            }
        }
        return tempList;
    }
}
