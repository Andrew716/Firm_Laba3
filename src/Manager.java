import java.util.*;

/**
 * Created by Andrii on 3/17/2015.
 */
public class Manager extends Person {
    private Set<Employee> employees = new HashSet<Employee>();

    public Manager(Date birthdayDate, IdCard id, String name, String surname) {
        super(birthdayDate, id, name, surname);
    }

    @Override
    public String toString(){
        return " Manager : "+ birthdayDate + id + name + surname;
    }
}
