package desicion_structure;

import java.util.Scanner;

public class salaryCalculator {

    static void main() {
        double salary = 1000;
        double bonus = 200;
        int quota = 10;

        System.out.println("how many sales did the employee get this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if (sales > quota){
            salary += bonus;
            System.out.printf("salary: " + salary);
        }

        scanner.close();

    }
}
