import java.io.IOException;
import java.util.Scanner;

public class extremelyBasic {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("X = " + sum);
    }
}
