package Task2;

public class Student extends Person{
    private  String status;
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    @Override
    public String toString() {
        return "Class name: Student" +
                "  person name = " + super.getName() ;
    }
}
