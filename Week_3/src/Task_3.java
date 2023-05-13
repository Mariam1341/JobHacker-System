//Task 3:  Write a program that takes an array of integers and removes all duplicate elements from the array.
import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> numbers = new LinkedHashSet<>();

        System.out.print("Enter 10 numbers : ");

        for(int i = 0; i < 10; i++){
            numbers.add(input.nextInt());
        }
    }
}
