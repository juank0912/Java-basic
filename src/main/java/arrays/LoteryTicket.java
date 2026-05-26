package arrays;

import java.util.Arrays;
import java.util.Random;

public class LoteryTicket {

    private static final int LENGTH = 6;
    //Variable that cannot be changed, because its final
    //a constant is declared by using an ALL CAPS name.
    private static final int MAX_TICKET_NUMBER = 69;

    static void main(String[] args) {
        var ticket = generateNumbers();
        printTicket(ticket);
    }

    private static void printTicket(int[] array) {
            Arrays.sort(array);
        System.out.print("| ");
            for (int number : array) {
                System.out.print(number + " | ");
            }
    }

    private static int[] generateNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(1,MAX_TICKET_NUMBER);
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
            //System.out.println("Generated number: " + randomNumber);
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) return true;
        }
        return false;
    }
}
