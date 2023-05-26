package Task2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Mariam");
        Student s = new Student();
        Employee e = new Employee();
        Faculty f = new Faculty();
        Staff st = new Staff();

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(st.toString());

    }
}
