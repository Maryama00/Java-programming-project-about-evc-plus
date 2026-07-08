import java.util.ArrayList;
import java.util.Scanner;

public class evc {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 500;

    public static void main(String[] args) {

        String code = "*770#";
        int pin = 4959;

        System.out.print("Enter Code: ");
        String userCode = scanner.next();

        if (!userCode.equals(code)) {
            System.out.println("Code khaldan");
            return;
        }

        System.out.print("Enter PIN: ");
        int userPin = scanner.nextInt();

        if (userPin != pin) {
            System.out.println("PIN khaldan");
            return;
        }

        while (true) {

            System.out.println("\n===== EVC PLUS =====");

            ArrayList<String> menu = new ArrayList<>();

            menu.add("1. Itus Haraaga");
            menu.add("2. Kaarka Hadalka");
            menu.add("3. Bixi Biil");
            menu.add("4. U Wareeji EVCPLUS");
            menu.add("5. Warbixin Kooban");
            menu.add("6. Salaam Bank");
            menu.add("7. Maareynta");
            menu.add("8. Biil Payment");
            menu.add("9. Exit");

            for (String item : menu) {
                System.out.println(item);
            }


            System.out.print("Dooro: ");
            int choice = scanner.nextInt();


            switch (choice) {

                case 1 -> balance();

                case 2 -> karka();

                case 3 -> biil();

                case 4 -> uWareeji();

                case 5 -> warbixin();

                case 6 -> banking();

                case 7 -> maareyn();

                case 8 -> payment();

                case 9 -> {
                    System.out.println("Mahadsanid");
                    return;
                }

                default -> System.out.println("Doorasho khaldan");
            }
        }
    }

    private static void banking() {
    }

    private static void biil() {
    }

    private static void warbixin() {
    }

    private static void maareyn() {
    }

    private static void payment() {
    }

    private static void karka() {
    }

    private static void uWareeji() {
    }


    static void balance() {

        System.out.println("Haraagaagu waa $" + balance);

    }
}