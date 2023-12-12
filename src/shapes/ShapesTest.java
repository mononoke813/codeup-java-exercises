package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 =new Rectangle(5, 4);
//        System.out.println(box1.getPerimeter());
        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
        Square box3 = new Square(5);
//        System.out.println(box3.getPerimeter());
        Square box4 = new Square(5);
        System.out.println(box4.getArea());
    }
}
