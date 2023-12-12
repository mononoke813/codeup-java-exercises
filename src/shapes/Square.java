package shapes;

public class Square extends Rectangle {

    // ------ constructor ------
    public Square(int side) {
        super(side, side);
    }

    // method override
    public int getPerimeter(int side) {
        return 4 * side;
    }
    public int getArea(int side) {
        return side ^ 2;
    }


}
