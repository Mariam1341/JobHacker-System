package Task2;

public class Student extends Person{
    private  String status;

    @Override
    public String toString() {
        return "Class name: Student" +
                "person name=" + super.getName() ;
    }
}
