//Task 2: Write a program that takes a number as input and prints the Fibonacci series up to that number.
import java.util.Scanner;
public class Task_2 {
    public static void fab(int num){
        int fnum = 0, snum = 1, temp, i = 0;
        boolean check = true;

        System.out.print(fnum);
        while(check){
            System.out.print(", " + snum);
            if(snum == num){
                check = false;
            }
            temp = fnum + snum;
            fnum = snum;
            snum = temp;

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to get it's fibonacci: ");
        int num = input.nextInt();

        System.out.println("\n The fibonacci series up to "+ num + " is: ");
        fab(num);
    }
}