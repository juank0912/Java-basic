package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    // Es lo mismo que la otra, pero pasamos objetos a las funciones. No valores como en la otra clase

    private Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        //Al ser una clase static debo darle una instancia a la calse para poder llamar a las funciones creadas dentro
        //de la misma que no estan dentro del main()
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();

        double totalArea = calculator.calculateArea(room1, room2);

        System.out.println("Total area of both rooms " + totalArea);
    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateArea(Rectangle room1, Rectangle room2) {
        return (room1.calculateArea() + room2.calculateArea());
    }
}
