package util;
import java.util.Scanner;


public class Input {
    private Scanner scanner;

    public String getString() {
        return this.scanner.nextLine();
    }
    public boolean yesNo() {
        String input = this.scanner.nextLine();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
    }
    public int getInt(int min, int max) {
        int input = this.scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getInt(min, max);
        }
        return input;
    }
    public int getInt() {
        return this.scanner.nextInt();
    }
    double getDouble(double min, double max) {
        double input = this.scanner.nextDouble();
        if (input < min || input > max) {
            System.out.println("Please enter a number between " + min + " and " + max);
            return getDouble(min, max);
        }
        return input;
    }
    public double getDouble() {
        return this.scanner.nextDouble();
    }
    public Input() {
        this.scanner = new Scanner(System.in);
    }

}
