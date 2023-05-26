package Task2;
import java.util.Date;

public class Employee extends Person{

    private String office;
    private double salary;
    private MyDate date;

    @Override
    public String toString() {
        return "Class name: Employee" +
                "person name=" + super.getName() ;
    }
}

