package Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter teh color: ");
        String color = input.next();

        boolean isFull = false;
        System.out.print("Is the triangle is full (Y / N): ");

        while(true){
            String check = input.next();
            if(check.equals("Y") || check.equals("y") ){
                isFull = true;
                break;
            } else if (check.equals("N") || check.equals("n")) {
                isFull = false;
               break;
            }else{
                System.out.print("You should enter Y or N try again");
            }
        }

        Triangle t1 = new Triangle(side1, side2, side3, color, isFull);

        System.out.println("\nThe triangle data: ");
        System.out.println("Area: " + t1.getArea());
        System.out.println("Perimeter: " + t1.getPerimeter());
        System.out.println("Color: " + t1.getColorName());
        if(t1.isFull()){
            System.out.println("The triangle is filled");
        }else{
            System.out.println("The triangle is not filled");
        }

    }
}