package loops;

import java.util.Scanner;

public class AddNumbers {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the next number");
            double num2 = scanner.nextDouble();

            System.out.println("Sum: " + (num1+num2));

            System.out.println("Do you want to do the sum again? 'false' for no, 'true' for yes");
            again = scanner.nextBoolean();
        }while (again);
    }
}
