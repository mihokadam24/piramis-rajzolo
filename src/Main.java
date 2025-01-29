import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
            piramis rajzoló
            kérjen a felhasználótól egy számot és rajzoljon olyan magasságú teljes piramis formát
        */

        // spagetti kód
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a piramis magasságát: ");
        int height = scanner.nextInt();
        if (height < 1) {
            System.out.println("A piramis magassága nem lehet kisebb, mint 1!");
        } else {
            for (int i = 0; i < height; i++) {
                for (int j = i; j < (height - 1); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= (i * 2); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
