package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter the radius of the circle: ");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());


        System.out.println("Would you like to make another circle?");
        boolean yesNo = input.yesNo();
        if (yesNo) {
            System.out.println("Enter the radius of the circle: ");
            radius = input.getDouble();
            circle = new Circle(radius);
            System.out.println("The area of the circle is: " + circle.getArea());
            System.out.println("The circumference of the circle is: " + circle.getCircumference());
        }
        else {
            System.out.println("Goodbye");
        }
    }
}
