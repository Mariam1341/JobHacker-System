
//Task 1: Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int num = input.nextInt();

        boolean check = true;
        for(int i = 2; i <= num / 2; ++i){
            if(num % i == 0){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("\n" + num + " is a prime number");
        }else{
            System.out.println("\n" + num + " is not a prime number");
        }

    }
}
