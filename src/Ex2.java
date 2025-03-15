import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar intreg: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Numarul este pozitiv.");
        } else if (num < 0) {
            System.out.println("Numarul este negativ.");
        } else {
            System.out.println("Numarul este zero.");
        }
    }
}
