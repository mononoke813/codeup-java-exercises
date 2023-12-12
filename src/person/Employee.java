package person;

public class Employee extends Person {
    public final String company = "Veridian Dynamics";
    private int salary;

    public String id;
    public Employee (String firstName) {
        super(firstName);
        this.id = "12345" + firstName;
    }
    public void doWork() {
        System.out.println("Pretend to work......");
    }
}