class Person {
    private String firstName = "First Name";
//    private String lastName = "Last Name";

    public String getName() {
        return this.firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String sayHello() {
        return String.format("Greetings Hooman, %s", firstName);
    }


    public static void main(String [] args) {
        Person lauren = new Person();
        lauren.firstName = "Lauren";
//        lauren.lastName = "G.";
        System.out.println(lauren.sayHello());

//        Person person1 = new Person();
//        System.out.println(person1.firstName);

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}
