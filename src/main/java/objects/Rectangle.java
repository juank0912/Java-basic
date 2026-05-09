package objects;

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(double length, double width, int sides) {
        this.length = length;
        this.width = width;
        this.sides = sides;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {
        setLength(0);
        setWidth(0);
    }

    public double calculatePerimeter(){
        return (2 * length) + (2* width);
    }

    public double calculateArea(){
        return (length * width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
