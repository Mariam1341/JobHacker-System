//Task 2: Write a program that takes a number as input and prints the Fibonacci series up to that number.
import java.util.Scanner;

public class Task_2 {
    public static int fab(int num){
        if(num <= 1) {
            return num;
        } else {
            return(fab(num - 1) + fab(num - 2));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to get its fibonacci: ");
        int finalNum = input.nextInt();

        System.out.println("\nThe fibonacci series up to "+ finalNum + " is: ");

        for(int i = 0; fab(i) <= finalNum; i++){
            System.out.print(fab(i) + " ");
        }

    }
}


