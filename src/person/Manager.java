package person;

public class Manager extends Employee {
    public Manager (String firstName) {
        super(firstName);
    }
    public Person fire(Employee employee){
        if (employee.id.equals(this.id)) {
            System.out.println("Go home..." + this.getFirstName() + ". You're drunk.");
            throw new IllegalArgumentException("You can't fire yourself!");
        }
        System.out.println("Sorry, " + employee.getFirstName() + ". We will happily write you a recommendation letter.... but you're fired from " + employee.company + ".");
        return new Person(employee.getFirstName());
    }
    public void sayHello(){
        System.out.println("Stares awkwardly in a different direction...");
    }

}