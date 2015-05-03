import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrii on 3/17/2015.
 */
public class MainClass {
    public static void main(String [] args) throws ParseException {
        //create dates
        final String date1 = "1994-06-25";
        final String date2 = "1995-04-03";
        final String date3 = "1985-09-13";
        final String date4 = "1998-01-18";
        final String date5 = "1992-02-12";
        final String date6 = "1993-01-10";
        //create id
        IdCard id1 = new IdCard(1);
        IdCard id2 = new IdCard(2);
        IdCard id3 = new IdCard(3);
        IdCard id4 = new IdCard(4);
        IdCard id5 = new IdCard(5);
        IdCard id6 = new IdCard(6);
        //connect date
        Date birthday1 = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
        Date birthday2 = new SimpleDateFormat("yyyy-MM-dd").parse(date2);
        Date birthday3 = new SimpleDateFormat("yyyy-MM-dd").parse(date3);
        Date birthday4 = new SimpleDateFormat("yyyy-MM-dd").parse(date4);
        Date birthday5 = new SimpleDateFormat("yyyy-MM-dd").parse(date5);
        Date birthday6 = new SimpleDateFormat("yyyy-MM-dd").parse(date6);
        //create departments
        Department programmerDepartment = new Department("Programmers");
        Department analytysisDepartment = new Department("Analysis");
        Department designerDepartment = new Department("Designer");
        Department financianalDepartment = new Department("Finansest");
        //create managers
        Manager manager1 = new Manager(birthday1, id1, "Sergii","Khomich");
        Manager manager2 = new Manager(birthday2, id2, "Petro", "Poroshenko");
         //create projects
        Project projectEco = new Project(manager1, "EcoProject");
        Project projectZELO = new Project(manager2, "ZELO");
        //create employees
        Employee employee1 = new Employee(birthday1,id1,"Mykita","Kachko",programmerDepartment,"developer","asfd");
        Employee employee2 = new Employee(birthday2,id2,"Andrii","Chesanovskii",analytysisDepartment,"analytic","asfd");
        Employee employee3 = new Employee(birthday3,id3,"Dmitro","Kryvolap",designerDepartment,"designer","asfd");
        Employee employee4 = new Employee(birthday4, id4,"Igor","Galitskii",financianalDepartment,"finansist",null);
        Employee employee5 = new Employee(birthday5, id5, "Roman", "Bondar", programmerDepartment, "QAdeveloper",null);
        Employee employee6 = new Employee(birthday6, id6, "Taras", "Shevchuk", programmerDepartment, "developer","asfd");
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
        //
        System.out.println(Menu.showEmployeesWorkingOnProject(projectEco));
    }
}
