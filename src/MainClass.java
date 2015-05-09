import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by Andrii on 3/17/2015.
 */
public class MainClass {
    public static void main(String [] args) throws ParseException {
        //create dates
        Date birthday1 = new Date(1994,6,25);
        Date birthday2 = new Date(1995,4,3);
        Date birthday3 = new Date(1985,9,13);
        Date birthday4 = new Date(1998,1,18);
        Date birthday5 = new Date(1992,2,12);
        Date birthday6 = new Date(1993,1,10);
        //create customers
        Customer customer1 = new Customer(birthday1, 9, "Sasha", "Yanko");
        Customer customer2 = new Customer(birthday3, 10, "Lera", "Andrienko");
        //create departments
        Department programmerDepartment = new Department("Programmers");
        Department analytysisDepartment = new Department("Analysis");
        Department designerDepartment = new Department("Designer");
        Department financianalDepartment = new Department("Finansest");
        //create list of departments and fill it
        List<Department> departmentList = new LinkedList<Department>();
        departmentList.add(programmerDepartment);
        departmentList.add(analytysisDepartment);
        departmentList.add(designerDepartment);
        departmentList.add(financianalDepartment);
        //create managers
        Manager manager1 = new Manager(birthday1, 1, "Serhii","Khomych");
        Manager manager2 = new Manager(birthday2, 2, "Petro", "Poroshenko");
        Manager manager3 = new Manager(birthday1, 3, "Tatyana", "Montyan");
        Manager manager4 = new Manager(birthday4, 5, "Anton", "Malcev" );
         //create projects
        Project projectEco = new Project("EcoProject");
        Project projectZELO = new Project("ZELO");
        Project projectGround = new Project("Ground");
        Project projectAir = new Project("Air");
        //set manager for project
        projectAir.setManager(manager1);
        projectEco.setManager(manager2);
        projectGround.setManager(manager3);
        projectZELO.setManager(manager4);
        projectZELO.setManager(manager1);
        //create list of projects
        Set<Project> listOfProjects1 = new HashSet<Project>();
        Set<Project> listOfProjects2 = new HashSet<Project>();
        Set<Project> listOfProjects3 = new HashSet<Project>();
        //fill lists of projects
        listOfProjects1.add(projectEco);
        listOfProjects1.add(projectAir);
        listOfProjects2.add(projectGround);
        listOfProjects3.add(projectZELO);
        listOfProjects3.add(projectGround);
        //create employees
        Employee employee1 = new Employee(birthday1,3,"Mykita","Kachko");
        Employee employee2 = new Employee(birthday2,4,"Andrii","Chesanovskii");
        Employee employee3 = new Employee(birthday3,5,"Dmitro","Kryvolap");
        Employee employee4 = new Employee(birthday4,6,"Igor","Galitskii");
        Employee employee5 = new Employee(birthday5,7, "Roman", "Bondar");
        Employee employee6 = new Employee(birthday6,8, "Taras", "Shevchuk");
        //create list of employees and fill it
        List<Employee> employeeList = new LinkedList<Employee>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        //set departments for employees
        employee1.setDepartment(programmerDepartment);
        employee2.setDepartment(analytysisDepartment);
        employee3.setDepartment(designerDepartment);
        employee4.setDepartment(financianalDepartment);
        employee5.setDepartment(programmerDepartment);
        employee6.setDepartment(programmerDepartment);
        //set position for employees
        employee1.setPosition("developer");
        employee2.setPosition("analytic");
        employee3.setPosition("designer");
        employee4.setPosition("finansist");
        employee5.setPosition("QAdeveloper");
        employee6.setPosition("developer");
        //set project for employee
        employee1.setProjects(listOfProjects1);
        employee2.setProjects(listOfProjects3);
        //set employees at departments
        programmerDepartment.addEmployee(employee1);
        analytysisDepartment.addEmployee(employee2);
        designerDepartment.addEmployee(employee3);
        financianalDepartment.addEmployee(employee4);
        programmerDepartment.addEmployee(employee5);
        programmerDepartment.addEmployee(employee6);
        //set employees on projects
        projectEco.addEmployee(employee1);
        projectEco.addEmployee(employee2);
        projectEco.addEmployee(employee3);
        projectZELO.addEmployee(employee6);
        //set projects for customer
        customer1.setProjects(listOfProjects1);
        customer2.setProjects(listOfProjects2);
        //output employees who working on this project
        System.out.println("employees who working on this project");
        System.out.println(Firm.showEmployeesWorkingOnProject(projectEco));
        System.out.println();
        //output projects which this employees still working
        System.out.println("projects which this employees still working");
        System.out.println(Firm.showProjectWhereEmployeeWorking(employee2));
        System.out.println();
        //output list of employees from department who is not working on project
        System.out.println("list of employees from department who is not working on project");
        System.out.println(Firm.showEmployeesInDepartmentNotWorkingOnProject(programmerDepartment));
        System.out.println();
        //output list of employees which are not working
        System.out.println("list of employees which are not working");
        System.out.println(Firm.showEmployeesNotWorking(departmentList));
        System.out.println();
        //output list of empoyee for given manager
        System.out.println("list of empoyee for given manager");
        System.out.println(Firm.showEmployeesForManager(manager3));
        System.out.println();
        //output list of managers for given employee
        System.out.println("list of managers for given employee");
        System.out.println(Firm.showManagersForEmployee(employee1));
        System.out.println();
        //output list of employees which working with given employee
        System.out.println("list of employees which working with given employee");
        System.out.println(Firm.showAnotherEmployeesForEmployee(employee1,departmentList));
        System.out.println();
        //output list of projects are performed for given customer
        System.out.println("list of projects are performed for given customer");
        System.out.println(Firm.showProjectsForCustomer(customer1));
        System.out.println();
        //output list of employees still working on projects are performed for given customer
        System.out.println("list of employees still working on projects are performed for given customer");
        System.out.println(Firm.showEmployeesWorkingForCustomer(customer1));
    }
}
