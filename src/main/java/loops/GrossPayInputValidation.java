package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    static void main() {
        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. your hours must be between 1 and 40. try again");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = hoursWorked * rate;

        System.out.println("Gross pay: " + grossPay);
    }
}
