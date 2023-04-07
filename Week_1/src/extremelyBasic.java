import java.io.IOException;
import java.util.Scanner;

public class Extremely_Basic {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
    }
}
