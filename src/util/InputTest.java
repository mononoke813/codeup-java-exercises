package util;

public class InputTest {
    public static void main(String[] args) {
//        System.out.println("Enter your favorite color");
//        String userInput = new Input().getString();
//        System.out.println("You chose: " + userInput);

//        System.out.println("Enter your favorite number");
//        int userInput = new Input().getInt();
//        System.out.println("You chose: " + userInput);

//        System.out.println("Do you like potatoes?");
//        boolean userInput = new Input().yesNo();
//        System.out.println("You said: " + userInput);

        System.out.println("How much money do you have?");
        double userInput = new Input().getDouble(5.70, 1000.00);
        System.out.println("You have: $" + userInput);
    }
}
