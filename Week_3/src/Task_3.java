//Task 3:  Write a program that takes an array of integers and removes all duplicate elements from the array.
import java.util.*;

public class Task_3 {
    public static int[] removeDuplicate(int[] arr){
        int newArr[] = new int[10];
        int j = 1;
        Arrays.sort(arr);
        newArr[0] = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i-1] != arr[i]){
                newArr[j] = arr[i];
                j++;
            }
        }
        int finalArr[] = new int[j];
        for(int i = 0; i < j; i++){
            finalArr[i] = newArr[i];
        }
        return finalArr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int arr[] = new int[10]; //as a test
        Set<Integer> arrSet = new HashSet<>();


        System.out.print("Enter 10 numbers : ");

        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
//            arrSet.add(input.nextInt());
        }
//
//        Iterator<Integer> iterator = arrSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }

        int resArr[] = removeDuplicate(arr);

        for(int i = 0; i < resArr.length; i++){
            System.out.print(resArr[i] + " ");
        }



    }
}
