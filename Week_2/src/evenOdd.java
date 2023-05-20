import java.util.Scanner;

//1-Write a program that takes an integer as input from the user and prints out whether it is even or odd.
public class evenOdd {

    public static String evenOdd (int  num){

        if(num % 2 == 0){
            return "even";
        }else{
            return "odd";
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        String result = evenOdd(num);

        System.out.println( num + " is an " + result + " number");
    }
}
