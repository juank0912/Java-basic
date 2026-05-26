package inheritance;

import objects.Rectangle;

public class InheritanceTester {
    static void main(String[] args) {
        Person person = new Person();
        //inicializamos la persona
        Employee employee = new Employee("juan  ");
        //inicializamos el empleado

        Square square = new Square();
        square.setLength(25);

        System.out.println(square.calculatePerimeter());

        square.print("overloaded"); // saca el overloaded
        square.print(); // saca el print de Rectangle.java

        Rectangle rectangle = new Rectangle();
        rectangle.print();
    }
}
