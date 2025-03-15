import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu 3 numere intregi: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num3 == num1){
            System.out.println("Toate numerele sunt egale.");
        } else if (num1 != num2 && num3 != num1 && num2 != num3){
            System.out.println("Toate numerele sunt diferite.");
        } else {
            System.out.println("Nici nu sunt egale, nici diferite.");
        }
    }
}
