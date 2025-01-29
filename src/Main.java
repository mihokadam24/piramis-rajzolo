import java.util.Scanner;

public class Main {

    public static final String SIGN = "*";
    public static final String SPACE = " ";
    public static final String MESSAGE = "Kérem a piramis magasságát: ";
    public static final int MINIMALHEIGHT = 2; // 1-el még működik, de az már nem piramis, hanem csak 1 *
    public static final String ERRORMESSAGE = "A piramis magassága nem lehet kisebb, mint " + MINIMALHEIGHT + "!";

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
            piramis rajzoló
            kérjen a felhasználótól egy számot és rajzoljon olyan magasságú teljes piramis formát
        */
        int height = getUserInput(MESSAGE);
        if (height < MINIMALHEIGHT) {
            System.out.println(ERRORMESSAGE);
        } else {
            drawPyramid(height);
        }
    }

    public static int getUserInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void drawPyramid(int height) {
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
