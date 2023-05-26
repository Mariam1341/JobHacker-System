package Task2;

public class Faculty extends Employee{
    private double officeHours;
    private double rank;

    @Override
    public String toString() {
        return "Class name: Faculty" +
                "  person name = " + super.getName() ;
    }
}
