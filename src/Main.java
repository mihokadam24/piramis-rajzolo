import java.util.Scanner;

public class Main {

    public static final String SIGN = "*";
    public static final String SPACE = " ";
    public static final String MESSAGE = "Kérem a piramis magasságát: ";
    public static final String ERRORMESSAGE = "A piramis magassága nem lehet kisebb, mint 1!";

    public static void main(String[] args) {
        /*
            piramis rajzoló
            kérjen a felhasználótól egy számot és rajzoljon olyan magasságú teljes piramis formát
        */

        // spagetti kód
        Scanner scanner = new Scanner(System.in);
        System.out.print(MESSAGE);
        int height = scanner.nextInt();
        if (height < 1) {
            System.out.println(ERRORMESSAGE);
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = i; j < (height - 1); j++) {
                    System.out.print(SPACE);
                }
                for (int k = 0; k <= (i * 2); k++) {
                    System.out.print(SIGN);
                }
                System.out.println();
            }
        }

    }
}
