package Task2;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Class name: Person" +
                "   person name = " + name ;
    }
}
