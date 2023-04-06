import java.io.IOException;
import java.util.Scanner;
public class Distance_Between_Two_Points {
    public static void main(String[] args)  throws IOException {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);
    }
}