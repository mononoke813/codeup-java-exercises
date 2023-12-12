class Person {

    private String firstName;
    private String lastName;

    //constructor method but NOT dynamic
public Person(String name,String lastName) {
    this.firstName = name;
    this.lastName = lastName;
}
    public Person(String name) {
        this.firstName = name;
    }


//read function - getter
    public String getName() {
        return this.firstName;
    }

    //write function - setter
    public void setName(String name) {
        this.firstName = name;
    }

    public String sayHello() {
        return String.format("Greetings Hooman, %s", firstName);
    }

public static int return2(){
    System.out.println(2);
    return 2;
}

    public static void main(String [] args) {
        Person newPerson = new Person("Sam");

        newPerson.firstName = "Lauren";
//        lauren.lastName = "G.";
        System.out.println(newPerson.sayHello());

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
