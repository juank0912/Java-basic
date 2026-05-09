package methods;

import java.util.Scanner;

public class InstantCreditcheck {

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner input = new Scanner(System.in);

    static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditscore();
        input.close();

        /*boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);*/
        notifyUser(isUserQualified(salary, creditScore));
    }

    private static void notifyUser(boolean userQualified) {
        if (userQualified) {
            System.out.println("You qualified your credit!");
        }else  {
            System.out.println("You are not qualified for a credit!");
        }
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        /*if (salary >= requiredSalary && creditScore >= requiredCreditScore) {
            return true ;
        }else{
            return false;
        }*/

        //it can be simplified by using
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    private static double getSalary() {
        /*System.out.println("Please enter your salary:");
        double salary = input.nextDouble();
        return salary;*/

        //can be simplified by using
        return input.nextDouble();
    }

    private static int getCreditscore() {
        /*System.out.println("Please enter your credit score:");
        int creditScore = input.nextInt();
        return creditScore;*/

        // can be simplified by using
        return input.nextInt();
    }
}
