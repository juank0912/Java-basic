package inheritance;

import objects.Rectangle;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter(){
        return sides * length;
        // logra coger sides y length porque son "protected fields" en Rectangle.java
        // lo que significa que encapsula las variables, pero pueden seguir utilizándose
        // sin o deberíamos utilizar getSides() y getLength
    }

    public void print(String what){
        System.out.println("I am a square " + what);
    }
}
