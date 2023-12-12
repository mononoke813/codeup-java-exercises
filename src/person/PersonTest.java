package person;

public class PersonTest {
    public static void main(String[] args) {
        Employee person1 = new Employee("Lauren");
        person1.sayHello();
        person1.doWork();

        Manager manager1 = new Manager("Ron");
        manager1.sayHello();
        try {
            Person fired = manager1.fire(person1);
            fired.sayHello();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}