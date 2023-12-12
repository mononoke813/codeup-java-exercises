import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//
//
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine().toLowerCase();
//        System.out.println(userInput);
//        long phoneNumber = sc.nextLong();
//        System.out.println(phoneNumber);

        Person jeremy = new Person("Jeremy");
        String myName = jeremy.getName();
        jeremy.setName("Sellers");
//        System.out.println(jeremy.getName());
//        jeremy.setName("Jeremy");
//        System.out.println(jeremy.getName());


    }
}

