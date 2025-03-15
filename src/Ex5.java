import java.util.Arrays;
import java.io.*;

public class Ex5 {
    public static void main(String[] args) {
        int [] lista = {3, 4, 5, 6 ,7};
        int sum = Arrays.stream(lista).sum();

        System.out.println("Suma array-ului este: " + sum);

    }
}
