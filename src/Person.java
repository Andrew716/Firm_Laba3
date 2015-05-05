import java.util.Date;

/**
 * Created by Andrii on 5/3/2015.
 */
public abstract class Person {
    protected String name;
    protected String surname;
    protected Date birthdayDate;
    protected int id;

    public Person(Date birthdayDate, int id, String name, String surname) {
        this.birthdayDate = birthdayDate;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
