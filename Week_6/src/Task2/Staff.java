package Task2;

public class Staff extends Employee{
    private String title;

    @Override
    public String toString() {
        return "Class name: Staff" +
                "person name=" + super.getName() ;
    }
}
