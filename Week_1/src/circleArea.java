import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class circleArea {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double pi = Math.PI;

        double area = pi * (r * r);

        System.out.printf("A=%.4f\n", area);
    }
}