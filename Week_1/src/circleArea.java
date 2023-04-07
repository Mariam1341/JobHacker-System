import java.io.IOException;
import java.util.Scanner;

public class Area_of_a_Circle {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double pi = 3.14159;

        double area = pi * (r * r);

        System.out.printf("A=%.4f\n", area);
    }
}