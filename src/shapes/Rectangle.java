package shapes;

public class Rectangle {

// ------ attributes ------
protected int length;
protected int width;

// ------ constructor ------
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

// ------ methods ------
    public int getArea() {
        return this.length * this.width;
    }
    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
}