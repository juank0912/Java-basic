package methods;

import java.util.Scanner;

public class Methods {
    static void main() {
        String name = getUserName();

        greetUser(name);

    }
    public static String getUserName() {
        System.out.println("Enter your user name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    private static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

}
