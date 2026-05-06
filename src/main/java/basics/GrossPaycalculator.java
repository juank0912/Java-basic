package basics;

import java.util.Scanner;

public class GrossPaycalculator {

    //Simple calculator

    public static void main(String[] args){
        IO.println("How many hours did u work?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // sout = System.out.println();
        System.out.println("What is your hourly rate?");
        double rate = scanner.nextDouble();
        scanner.close();
        //If I don't close the scanner some resources might be running in the background.
        // not the end of the world but causes performance issues

        double payRate = hours * rate;

        System.out.println("Gross pay: " + payRate);
    }
}
