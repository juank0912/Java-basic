package desicion_structure;

import java.util.Scanner;

public class QuotaCalculator {

    static void main() {
        int quota = 10;

        System.out.println("Sales made: ");
        Scanner scanner = new Scanner(System.in);

        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota){
            System.out.println("Congrats");
        }else{
            int salesShort = quota - sales;
            System.out.println("Not to good. " +
                    "You were short by: " + salesShort + " sales.");
        }
    }
}
