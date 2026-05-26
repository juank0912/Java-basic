package objects;

public class HomeAreaCalculator {
    static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);

        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30.,75);

        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Total area of both rooms " + totalArea);
        System.out.println("Area of room 1: " + areaOfRoom1);
        System.out.println("Area of room 2: " + areaOfRoom2);
    }
}
