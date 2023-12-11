class Person {
    private String firstName = "First Name";
    private String lastName = "Last Name";

    public String sayHello() {
        return String.format("Greetings Hooman, %s %s", firstName, lastName);
    }
    public String getName() {
        return this.firstName;
    }
    public void setName(String name) {
        this.firstName = name;
    }

    public static void main(String [] args) {
        Person lauren = new Person();
        lauren.firstName = "Lauren";
        lauren.lastName = "G.";
        System.out.println(lauren.sayHello());

        Person person1 = new Person();
        System.out.println(person1.firstName);


    }

}
